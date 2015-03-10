package dao;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.awt.print.Book;
import java.util.List;

import org.junit.Test;

public class BookDaoTest {

	@Test
	public void BookDAO() {
		BookDAO b = new BookDAO();
		List<Book> books = b.findAll();

		// 結果がnullでないこと
		assertThat(books, notNullValue());
	}
}