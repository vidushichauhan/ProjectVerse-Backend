package com.projectverse.apis.controllers;

import com.projectverse.apis.services.ChatServices;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenAIController {

    @Autowired
    public final ChatServices chatServices;

    @Autowired
    public GenAIController(ChatServices chatServices) {
        this.chatServices = chatServices;

    }

    @GetMapping("ask-ai")
    public String getChatByPrompt(@RequestParam String prompt) {
        return chatServices.getResponse(prompt);
    }

    @GetMapping("ask-ai-options")
    public String getResponseOptions(@RequestParam String prompt) {
        return chatServices.getResponseOptions(prompt);
    }
}
