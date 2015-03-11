package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Book;

public class BookDAO {
	public List<Book> findAll() {

		Connection conn = null;
		List<Book> books = new ArrayList<Book>();

		try {
			// JDBCドライバを読み込み
			Class.forName("com.mysql.jdbc.Driver");

			// データベースへ接続
			conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.137.0:3306/bn_books", "kamigata",
					"kamigatapass");

			// SELECT文を準備
			String sql = "SElECT * FROM book";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			// 結果表に格納レコードの内容を
			// Bookインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				rs.getString("isbn");
				rs.getString("bookName");
				rs.getString("authorName");
				rs.getString("publisherName");
				rs.getShort("price");
				rs.getDate("releaseDate");
				rs.getShort("categoryId");
				rs.getTimestamp("modifyDatetime");
				rs.getTimestamp("createDatetime");
				Book book = new Book();
				books.add(book);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} finally {
			// データベース切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
		return books;
	}
}