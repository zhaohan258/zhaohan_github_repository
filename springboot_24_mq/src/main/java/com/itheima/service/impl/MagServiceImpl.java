package com.itheima.service.impl;

import com.itheima.service.MsgService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//@Service
public class MagServiceImpl implements MsgService {

    private ArrayList<String> msgList = new ArrayList<>();

    @Override
    public void sendMsg(String id) {
        System.out.println("待发送短信的订单已纳入处理队列，id" + id);
        msgList.add(id);
    }

    @Override
    public String doMsg() {
        String id = msgList.remove(0);
        System.out.println("已完成短信发送业务，id" + id);
        return id;
    }
}
