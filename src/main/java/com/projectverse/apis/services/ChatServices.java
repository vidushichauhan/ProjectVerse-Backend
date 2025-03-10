package com.projectverse.apis.services;

import jakarta.annotation.PostConstruct;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ChatServices {

    private final ChatModel chatModel;

    @Value("${spring.ai.openai.api-key}")
    private String apiKey;
    @PostConstruct
    public void init() {
        System.out.println("API Key Loaded: " + apiKey);
    }
    public ChatServices(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String getResponse(String prompt){
        return chatModel.call(prompt);
    }

    public String getResponseOptions(String prompt){
        ChatResponse response = chatModel.call(
                new Prompt(
                        prompt,
                        OpenAiChatOptions.builder()
                                .model("gpt-4-o")
                                .temperature(0.4)
                                .build()
                ));
        return response.getResult().getOutput().getContent();
    }
}
