package com.example.spring_ai_model.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatAIConfiguration {

    @Bean(name="openAIChatClient")
    public ChatClient openAIChatClient(OpenAiChatModel openAIChatModel){
        return ChatClient.builder(openAIChatModel).build();
    }

    @Bean(name="ollamaChatCLient")
    public ChatClient ollamaChatCLient(OllamaChatModel ollamaChatModel){
        return ChatClient.builder(ollamaChatModel).build();
    }
}
