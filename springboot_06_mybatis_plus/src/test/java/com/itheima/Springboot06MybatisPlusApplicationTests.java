package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

	@Autowired
	private BookDao bookDao;

	@Test
	void contextLoads() {
		Book book = bookDao.selectById(1);
		List<Book> booksList = bookDao.selectList(null);
		System.out.println(book);
		System.out.println("==========");
		System.out.println(booksList);
	}
}
