package com.itheima.dao;

import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private Book book;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
        ;
    }

    @Test
    void testSave() {
        book.setType("计算机技术");
        book.setName("算法");
        book.setDescription("入门算法书");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        book.setId(4);
        book.setType("计算机技术");
        book.setName("算法2");
        book.setDescription("入门算法书");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(4);
    }

    @Test
    void testGetAll() {
        bookDao.selectList(null);
    }

    @Test
    void testGetPage() {

    }

    @Test
    void testGetBy() {

    }

}
