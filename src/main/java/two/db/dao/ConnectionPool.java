package two.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Zašto kreiramo KLASU ?
 * <odgovor> Da bi kreirali kolko nam duša poželi varijabli ili objekata</odgovor>
 * Ima li smisla dizajnirati klasu po čijem šablonu kreiramo pobrojano mnogo objekata ?
 * <odgovor>Ne treba nam klasa nego enum koji je sličan klasi</odgovor>
 * Ima li smisla dizajnirati klasu po čijem šablonu kreiramo TAČNO JEDAN OBJEKAT  ?
 * <odgovor>Trebamo dizajnirati KLASU po patternu zvanom SINGLETON</odgovor>
 */
public class ConnectionPool {
    private List<Connection> availableConnections = new ArrayList<>(20);
    private List<Connection> inUseConnections = new ArrayList<>(20);

    //SINGLETON
    private ConnectionPool() {
        System.out.println("Kreiram connection pool ili bazen");
        for (int i = 0; i < 20; i++) {
            Connection connection = createConnection();
            availableConnections.add(connection);
        }
    }

    private Connection createConnection() {
        String url = "jdbc:mysql://localhost:3308/store";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public Connection getConnection() {
        if (availableConnections.isEmpty()) {
            throw new RuntimeException("Nema više konekcija..");
        }
        Connection connection = availableConnections.getFirst();
        availableConnections.remove(connection);
        inUseConnections.add(connection);
        return connection;
    }

    public void releaseConnection(Connection connection) {
        availableConnections.add(connection);
        inUseConnections.remove(connection);
    }

    //SINGLETON:
    // STEP 1: private konstruktor
    // STEP 2: instanciranje ConnectionPool jednom
    // STEP 3: pristup toj uvijek jednoj instanci
    private static ConnectionPool elvisInstance = null;

    //1. instance();
    public static ConnectionPool instance(){
        if(elvisInstance == null){
            elvisInstance = new ConnectionPool();
        }
        return elvisInstance;
    }
}
