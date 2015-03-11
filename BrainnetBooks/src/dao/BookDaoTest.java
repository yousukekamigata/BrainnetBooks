package dao;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import model.Book;

import org.junit.Test;

public class BookDaoTest {

	private String book;

	@Test
	public void BookDAO() {
		BookDAO b = new BookDAO();
		List<Book> books = b.findAll();

		// 結果がnullでないこと
		assertThat(books, notNullValue());
	}

	@Test
	public void データベースの取得() {
		BookDAO b = new BookDAO();
		List<Book> books = b.findAll();

		// データベースからすべての値を取得できているか
		//Listから要素を取り出す
		Book book = books.get(1);
		String bookName = book.getBookName();


		//Iterator<Book> it = books.iterator();
	}

}
