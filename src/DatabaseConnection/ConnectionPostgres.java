package DatabaseConnection;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionPostgres {

    private static Connection connn = null;

    private ConnectionPostgres() {

    }

    public static synchronized Connection getConnection() throws SQLException {
        try {
            if (connn == null || connn.isClosed()) {
                System.out.println("Conectando ao banco de dados...");
                String url = "jdbc:postgresql://localhost:5433/phoenixconverterDB";
                String user = "postgres";
                String password = "211205";
                connn = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return connn;
    }

    public static void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try {
            if (stmt != null) {
                stmt.close();
            }

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {

        }
    }
}
