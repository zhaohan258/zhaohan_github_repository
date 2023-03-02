package com.itheima;

import com.itheima.dao.impl.BookDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes=Springboot04JuintApplication.class)//引导类
//@ContextConfiguration(classes = Springboot04JuintApplication.class)
class Springboot04JuintApplicationTests {

	//springboot整合junit的测试过程

	//1.注入要测试的对象
	@Autowired
	private BookDaoImpl bookDao;
	//2.执行要测试的对象对应的方法


	@Test
	void contextLoads() {
		bookDao.save();
	}

}
