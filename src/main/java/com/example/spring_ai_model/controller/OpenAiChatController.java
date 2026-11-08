/*
package com.example.spring_ai_model.controller;

import com.example.spring_ai_model.service.OpenAIChatServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openai/api")
public class OpenAiChatController {

    private final OpenAIChatServices openAIChatServices;

    public OpenAiChatController(OpenAIChatServices openAIChatServices){
        this.openAIChatServices = openAIChatServices;
    }

    @GetMapping("/chatWithOpenAI")
    public String chatWithOpenAILLM(@RequestParam("message") String message){
        return openAIChatServices.chatWithOpenAILLM(message);
    }

    @GetMapping("/chatWithOllama")
    public String chatWithOllamaLLM(@RequestParam("message") String message){
        return openAIChatServices.chatWithOllamLLM(message);
    }
}
*/
