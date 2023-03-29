package com.itheima.service.impl;

import com.itheima.service.MsgService;
import com.itheima.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private MsgService msgService;
    @Override
    public void order(String id) {
        //
        System.out.println("订单处理开始");

        //短信消息处理
        msgService.sendMsg(id);
        System.out.println("订单处理结束");
    }
}
