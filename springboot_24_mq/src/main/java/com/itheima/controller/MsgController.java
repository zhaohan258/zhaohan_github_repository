package com.itheima.controller;

import com.itheima.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MsgController {
    @Autowired
    private MsgService msgService;
    @GetMapping
    public String doMsg() {
        String id = msgService.doMsg();
        return id;
    }
}
