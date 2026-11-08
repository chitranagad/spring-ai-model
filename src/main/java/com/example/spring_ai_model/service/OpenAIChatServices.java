/*
package com.example.spring_ai_model.service;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OpenAIChatServices {

    private final ChatClient chatClient;

    public OpenAIChatServices(ChatClient.Builder chatClientBuilder){
        this.chatClient = chatClientBuilder.build();
    }

    public String chatWithOpenAILLM(String message){

        return chatClient
                .prompt(message)
                .call()
                .content();
    }

    public String chatWithOllamLLM(String message){

        return chatClient
                .prompt(message)
                .call()
                .content();
    }
}
*/
