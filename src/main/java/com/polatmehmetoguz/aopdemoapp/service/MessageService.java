package com.polatmehmetoguz.aopdemoapp.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {


    public String sendMessage(String message){
        System.out.println("Your message : " + message);
        return message;
    }
}
