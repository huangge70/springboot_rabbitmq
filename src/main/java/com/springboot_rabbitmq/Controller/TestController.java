package com.springboot_rabbitmq.Controller;

import com.springboot_rabbitmq.rabbitmq.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private MsgProducer producer;

    @RequestMapping("/send")
    public String send(){
        producer.sendMsg("hello");
        return "发送成功!";
    }
}
