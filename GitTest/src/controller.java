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
			String password = "smhdr3";
			
			conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println("����̹� ���� ����");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("conn ����");
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
			System.out.println("�ݳ�����");
			e.printStackTrace();
		}
	}

	public void insert(info cat_info) {
	getCon();
	try {
		String sql = "insert into mem values(?, ?, ?)";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, cat_info.getId());
		psmt.setString(2, cat_info.getPw());
		psmt.setString(3, cat_info.getName());

		row = psmt.executeUpdate();

	} catch (SQLException e) {
		System.out.println("���� ����");
		e.printStackTrace();
	}

	finally {
		Close();
	}
}

	public void insert(String id, String pw, String cat_name, String cat_species) {
		// TODO Auto-generated method stub
		
	}


}
