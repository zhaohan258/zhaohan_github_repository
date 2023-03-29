package com.itheima.test;

import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
public class TestMongoDB {
    @Autowired
    private MongoTemplate mongoTemplate;

//    @Test
//    void doSet(){
//        Book book = new Book();
//        book.setId(1);
//        book.setName("计算机算法");
//        book.setType("计算机科学技术");
//        book.setDescription("入门书");
//        mongoTemplate.save(book);
//    }

//    @Test
//    void doGet(){
//        List<Book> all = mongoTemplate.findAll(Book.class);
//        System.out.println(all);
//    }

}
