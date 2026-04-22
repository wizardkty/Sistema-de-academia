package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection getConnection(){  
        try{
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/academia","root","2386");
        } catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}

