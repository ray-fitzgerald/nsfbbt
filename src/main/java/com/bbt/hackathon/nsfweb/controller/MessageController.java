package com.bbt.hackathon.nsfweb.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbt.hackathon.nsfweb.data.Message;

@RestController
public class MessageController {
    
    @RequestMapping("/message")
    public Message welcome() {        
        return new Message("This Message came from the server", "Peter");
    }
    
}
