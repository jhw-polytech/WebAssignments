package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection getConnection() {

        String url 		= "jdbc:oracle:thin:@192.168.119.119:1521:dink";
        String user 	= "scott";
        String password = "tiger";

        Connection conn = null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, password);

        } catch(Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

}