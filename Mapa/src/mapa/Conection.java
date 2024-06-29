package mapa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {

    private static final String url = "jdbc:mysql://localhost:3306/mapa";
    private static final String user = "root";
    private static final String password = "root";
    
    private static Connection conn;
    
    public static Connection getConexao() throws SQLException {
        if (conn == null || conn.isClosed()) {
            try {
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                throw new SQLException("Erro ao conectar no banco de dados", e);
            }
        }
        return conn;
    }
}
