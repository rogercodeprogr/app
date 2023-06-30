package connect;

import java.sql.DriverManager;

/**
 *
 * Autor: Rogério dos Santos
 * Data: 28/06/2023
 */
public class ConnectionApp {
    
    public static java.sql.Connection connector() {
        java.sql.Connection connection = null;
        //Carrega o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/bdhotel";
        String user = "root";
        String password = "d20m0768#database@dev15122020R";     
        //Conectando com o banco de dados
        try {
            Class.forName(driver);
            connection =  DriverManager.getConnection(url, user, password);
            return connection;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }    
}
