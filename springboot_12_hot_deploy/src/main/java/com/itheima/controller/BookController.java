package com.itheima.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.Result;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController {

//    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public List<Book> getAll(){
       return iBookService.list();



    }

    @PostMapping
    public Boolean save(@RequestBody Book book){
        return iBookService.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book){
        return iBookService.modify(book);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){
        return iBookService.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return iBookService.getById(id);
    }

    //分页
    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable  int pageSize){
        return iBookService.getPage(currentPage,pageSize);
    }
}
