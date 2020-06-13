package kr.ac.kopo.colaBank.DAO;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BaseDAO {

    public static Connection conn;
    public static PreparedStatement pstmt;
    public static String userId = null;

    public BaseDAO() {

    	try {
    		conn = new ConnectionFactory().getConnection();
    	}
    	catch(Exception e) {
    		JDBCClose.close(conn, pstmt);
    		e.printStackTrace();
    	}
    }

    @Override
	protected void finalize() throws Throwable {
		JDBCClose.close(conn, pstmt);
		super.finalize();
	}

}
