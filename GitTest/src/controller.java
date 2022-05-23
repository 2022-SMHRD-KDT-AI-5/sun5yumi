import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class controller {
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	int row = 0;
	
	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "cgi_7_0516_3";
			String password = "smhrd3";
			
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

	public void insert(String id, String pw, String cat_name, String cat_species) {
	getCon();
	try {
		String sql = "insert into person values(?, ?, ?, ?)";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, id);
		psmt.setString(2, pw);
		psmt.setString(3, cat_name);
		psmt.setString(4, cat_species);

		row = psmt.executeUpdate();

	} catch (SQLException e) {
		System.out.println("연결 오류");
		e.printStackTrace();
	}

	finally {
		Close();
	}
}


}
