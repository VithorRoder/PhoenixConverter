package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPostgres {

    private static Connection conn;

    private static final String URL = "jdbc:postgresql://localhost:5433/phoenixconverterDB";
    private static final String USER = "postgres";
    private static final String PASS = "211205";

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                System.out.println("Conectando com o Banco de Dados...");
                conn = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados: " + e.getMessage(), e);
        }

        return conn;
    }

    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
