package com.polatmehmetoguz.aopdemoapp.service;

import com.polatmehmetoguz.aopdemoapp.model.Message;
import com.polatmehmetoguz.aopdemoapp.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {


    public String sendMessage(String message){
        System.out.println("Your message : " + message);
        return message;
    }
}
