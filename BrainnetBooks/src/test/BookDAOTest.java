package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDAOTest {
	public static void main(String[] args) {
		// STEP 0: 事前準備（JAR配置を含む）
	    try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	    // STEP 1: データベースの接続
	    final String url = "jdbc:mysql://192.168.137.0:3306/bn_books";
	    final String user = "kamigata";
	    final String password = "kamigatapass";
	    Connection con = null;


	    try {
	    	con = DriverManager.getConnection(url,user,password);
			System.out.println("接続しました。");
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("接続失敗。");
		}

	}
}