import java.sql.Connection;
import java.sql.SQLException;

import db.DBConnection;

public class Main {
    public static void main(String[] args) {
        try(Connection c = DBConnection.getConnection()){
            System.out.println("System connected : " + !c.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
