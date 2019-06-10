
package chatwithaes256;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Config {
    Connection con;
    Statement stm;
    private static Connection mysqlconfig;
    public Connection configDB(){
        try {
            String url="jdbc:mysql://localhost:3306/chatwithaes256_db"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
            stm = mysqlconfig.createStatement();
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}
