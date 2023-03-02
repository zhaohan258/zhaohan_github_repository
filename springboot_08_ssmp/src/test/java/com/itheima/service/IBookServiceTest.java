package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class IBookServiceTest {

    @Autowired
    private IBookService bookService;

    @Autowired
    private Book book;

    @Test
    void testGetById() {
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void testSave() {
        bookService.save(book);
    }

    @Test
    public void testUpdate() {
        bookService.updateById(book);
    }

    @Test
    public void testDelete() {
        bookService.removeById(2);
    }

    @Test
    public void testGetAll() {
        List<Book> books = bookService.list();
        System.out.println(books);
    }

    @Test
    public void testPage() {
        Page<Book> page = new Page<>(2, 5);
        bookService.page(page);
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
    }

    /*
    @Test
    public void testGetByCondition(){
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","Spring");// select * from tbl_book where name like %Spring%
        List<Book> books = bookDao.selectList(queryWrapper);
        System.out.println(books);
    }

    @Test
    public void testGetByCondition2(){
        String name ="Spring";

        LambdaQueryWrapper<Book> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name!=null,Book::getName,name);//?
        List<Book> books = bookDao.selectList(lambdaQueryWrapper);
        System.out.println(books);
    }*/
}
