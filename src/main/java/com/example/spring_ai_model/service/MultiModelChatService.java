package com.example.spring_ai_model.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class MultiModelChatService {

    private final ChatClient openAIChatClient;
    private final ChatClient ollamaChatCLient;

    public MultiModelChatService(ChatClient openAIChatClient, ChatClient ollamaChatCLient){
        this.openAIChatClient=openAIChatClient;
        this.ollamaChatCLient=ollamaChatCLient;
    }

    public String chatWithOpenAI(String message){
        return openAIChatClient
                .prompt(message)
                .call()
                .content();
    }

    public String chatWithOllama(String message){
        return ollamaChatCLient
                .prompt(message)
                .call()
                .content();
    }
}
