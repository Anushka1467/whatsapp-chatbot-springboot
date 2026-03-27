package com.anushka.whatapps_chatbot.controller;

import com.anushka.whatapps_chatbot.model.MessageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {

        String userMessage = request.getMessage();

        System.out.println("Incoming Message: " + userMessage);

        if (userMessage.equalsIgnoreCase("hi")) {
            return "Hello";
        } 
        else if (userMessage.equalsIgnoreCase("bye")) {
            return "Goodbye";
        } 
        else {
            return "Sorry, I didn't understand.";
        }
    }
}