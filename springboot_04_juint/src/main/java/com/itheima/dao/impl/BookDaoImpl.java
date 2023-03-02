package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository//该类交给spring来管理
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao is running...");
    }
}
