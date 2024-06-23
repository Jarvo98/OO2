package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class DatabaseAccessProxy implements DatabaseAccess {
    private DatabaseRealAccess realAccess;
    private AccessProvider accessProvider;
    private Logger logger;

    public DatabaseAccessProxy(DatabaseRealAccess realAccess, AccessProvider accessProvider) {
        this.realAccess = realAccess;
        this.accessProvider = accessProvider;
        this.logger = Logger.getLogger("main.database.access");
        this.logger.addHandler(new ConsoleHandler());
    }

    @Override
    public Collection<String> getSearchResults(String queryString) throws Exception {
        if (this.accessProvider.isCurrentUserLoggedIn()) {
            this.logger.info("Busqueda de resultados realizada correctamente");
            return this.realAccess.getSearchResults(queryString);
        } else {
            this.logger.severe("Acceso no autorizado a la base de datos");
            throw new Exception("User is not authenticated");
        }
    }

    @Override
    public int insertNewRow(List<String> rowData) throws Exception {
        if (this.accessProvider.isCurrentUserLoggedIn()) {
            this.logger.warning("Insertado un nuevo elemento a la base de datos");
            return this.realAccess.insertNewRow(rowData);
        } else {
            this.logger.severe("Acceso no autorizado a la base de datos");
            throw new Exception("User is not authenticated");
        }
    }
}
