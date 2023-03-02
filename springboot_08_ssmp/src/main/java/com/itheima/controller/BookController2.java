package com.itheima.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.Result;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public Result getAll(){
        return new Result(true,iBookService.list());
    }

    @PostMapping
    public Result save(@RequestBody Book book){
        return new Result(iBookService.save(book));
    }

    @PutMapping
    public Result update(@RequestBody Book book){
        return new Result(iBookService.modify(book));
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        return new Result( iBookService.removeById(id));
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        return new Result(true, iBookService.getById(id));
    }

    //分页
    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage,@PathVariable  int pageSize){
        return new Result(true, iBookService.getPage(currentPage,pageSize));
    }
}
