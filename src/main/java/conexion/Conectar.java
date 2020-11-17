package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar{

    static String bd = "bdcooperativa";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection connection = null;

    String url2 = String.format("jdbc:mysql://localhost:3306/%s?verifyServerCertificate=false&useSSL=false&serverTimezone=UTC", bd);//deshabilita el certificado SSL
    
    public Conectar(){
        try{
        //Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url2,login,password); 
        if (connection!=null){
            System.out.println("Conexion a base de datos "+bd+" OK\n");
        }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        connection = null;
    }


}
