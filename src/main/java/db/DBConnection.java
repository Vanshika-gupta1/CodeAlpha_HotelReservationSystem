package db;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    public static Connection getConnection() throws SQLException{
        Properties p = new Properties();
        try(FileReader fr = new FileReader("config.properties")){
            p.load(fr);
        } catch (IOException e) {
            throw new SQLException("could not read config.properties ",e);
        }
        String url = p.getProperty("db.url");
        String user = p.getProperty("db.user");
        String password = p.getProperty("db.password");
        return DriverManager.getConnection(url,user,password);
    }
}
