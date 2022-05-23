import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class controller {
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	
	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 접속 오류");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("conn 오류");
				e.printStackTrace();
			}
		}

	public void Close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("반납오류");
			e.printStackTrace();
		}
	}



}
