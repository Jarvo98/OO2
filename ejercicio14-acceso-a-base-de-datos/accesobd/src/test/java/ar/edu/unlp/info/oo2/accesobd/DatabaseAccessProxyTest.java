package ar.edu.unlp.info.oo2.accesobd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseAccessProxyTest {
    private DatabaseAccess database;
    private AccessProvider accessProvider;

    @BeforeEach
    public void setUp() {
        this.accessProvider = new AccessProvider();
        this.database = new DatabaseAccessProxy(new DatabaseRealAccess(), this.accessProvider);
    }

    @Test
    public void testGetSearchResults() {
        this.accessProvider.logIn();
        try {
            assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
            assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
        } catch (Exception e) {
            Logger.getLogger("main.access").severe(e.getLocalizedMessage());
        }
    }
}
