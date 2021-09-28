package com.polatmehmetoguz.aopdemoapp.controller;

import com.polatmehmetoguz.aopdemoapp.repository.MessageRepository;
import com.polatmehmetoguz.aopdemoapp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dailyMessage")
public class MessageController {

    @Autowired
    private MessageService messageService;

    private MessageRepository messageRepository;

    public MessageController(MessageService messageService, MessageRepository messageRepository) {
        this.messageService = messageService;
        this.messageRepository = messageRepository;
    }


    @PostMapping
    public ResponseEntity<String> getAllMessage(@RequestBody String message){
        return ResponseEntity.ok(messageService.sendMessage(message));
    }

}
