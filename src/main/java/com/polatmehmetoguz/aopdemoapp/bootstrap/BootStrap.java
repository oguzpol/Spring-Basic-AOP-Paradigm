package com.polatmehmetoguz.aopdemoapp.bootstrap;

import com.polatmehmetoguz.aopdemoapp.model.Message;
import com.polatmehmetoguz.aopdemoapp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {


    private final MessageService messageService;

    public BootStrap(MessageService messageService) {
        this.messageService = messageService;
    }

    public String sendMessage(String message) {
        System.out.println("Your message : " + message);
        return message;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");

        System.out.println("Your message : " + messageService.sendMessage("Hello world, what'up!"));


    }
}
