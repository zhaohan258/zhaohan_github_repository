package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//开启虚拟MVC的调用
@AutoConfigureMockMvc
class Springboot14TestApplicationTests {

    @Test
    void testSpringbootWebRequest(@Autowired MockMvc mvc) throws Exception {
        //模拟调用 http://localhost:{port}/books
        RequestBuilder builder = MockMvcRequestBuilders.get("/books");
        mvc.perform(builder);
    }


}
