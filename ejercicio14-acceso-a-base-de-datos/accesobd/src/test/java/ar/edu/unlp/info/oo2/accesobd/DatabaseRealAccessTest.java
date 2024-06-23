package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
    }

    @Test
    void testGetSearchResults() {
        try {
            assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
            assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
        } catch (Exception e) {
            Logger.getLogger("main.access").severe(e.getLocalizedMessage());
        }
    }

    @Test
    void testInsertNewRow() {
        try {
            assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
            assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
        } catch (Exception e) {
            Logger.getLogger("main.access").severe(e.getLocalizedMessage());
        }
    }
}