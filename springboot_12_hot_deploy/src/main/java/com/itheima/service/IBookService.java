package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

//MyBatis-plus的service层业务代码（继承IService类）
public interface IBookService extends IService<Book> {


    boolean modify(Book book);

    IPage<Book> getPage(int currentPage,int pageSize);
}
