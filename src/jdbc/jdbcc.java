package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcc {
    public static void main(String args[])
            throws SQLException, ClassNotFoundException
    {
        String driverClassName
                = "sun.jdbc.odbc.JdbcOdbcDriver";
        String url = "jdbc:odbc:XE"; //database url
        String username = "scott"; //sql username
        String password = "tiger"; //sql password
        String query
                = "insert into students values(109, 'bhatt')";

        // Load driver class
        Class.forName(driverClassName);

        // Obtain a connection
        Connection con = DriverManager.getConnection(
                url, username, password);

        // Obtain a statement
        Statement st = con.createStatement();

        // Execute the query
        int count = st.executeUpdate(query);
        System.out.println(
                "number of rows affected by this query= "
                        + count);

        // Closing the connection as per the
        // requirement with connection is completed
        con.close();
    }
}
