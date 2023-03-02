package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTest {

    //注入Dao层对象
    @Autowired
    private BookDao bookDao;

    //注入实体类模拟数据层对象传递
    @Autowired
    private Book book;

    /**
     * 根据id查询
     */
    @Test
    public void testGetById(){
        Book book = bookDao.selectById(1);
        System.out.println(book);
    }

    /**
     * 添加
     */
    @Test
    public void testSave(){
        bookDao.insert(book);
    }

    /**
     * 更新
     */
    @Test
    public void testUpdate(){
        bookDao.updateById(book);
    }

    /**
     * 删除
     */
    @Test
    public void testDelete(){
        bookDao.deleteById(2);
    }

    /**
     * 查询全部
     */
    @Test
    public void testGetAll(){
        List<Book> books = bookDao.selectList(null);
        System.out.println(books);
    }

    /**
     * 分页
     */
    @Test
    public void testPage(){
        IPage page =new Page(1,5);
        bookDao.selectPage(page,null);
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
    }

    /**
     * 根据条件查询
     */
    @Test
    public void testGetByCondition(){
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","Spring");// select * from tbl_book where name like %Spring%
        List<Book> books = bookDao.selectList(queryWrapper);
        System.out.println(books);
    }

    /**
     * 根据条件查询
     */
    @Test
    public void testGetByCondition2(){
        String name ="Spring";

        LambdaQueryWrapper<Book> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name!=null,Book::getName,name);//?
        List<Book> books = bookDao.selectList(lambdaQueryWrapper);
        System.out.println(books);
    }



}
