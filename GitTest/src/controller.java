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

	// 회원가입 메소드
	public void insert(info cat_info) {
	getCon();
	try {
		String sql = "insert into mem values(?, ?, ?)";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, cat_info.getId());
		psmt.setString(2, cat_info.getPw());
		psmt.setString(3, cat_info.getSpecies());

		row = psmt.executeUpdate();
		
		if(row > 0) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("가입 실패");
		}

	} catch (SQLException e) {
		System.out.println("연결 오류");
		e.printStackTrace();
	}

	finally {
		Close();
	}
	
	
	// 호
	
}


}
