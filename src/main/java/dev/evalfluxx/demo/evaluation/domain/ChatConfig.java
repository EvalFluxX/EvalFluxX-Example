package dev.evalfluxx.demo.evaluation.domain;

import dev.evalfluxx.demo.ChatService;

public class ChatConfig {
    private ChatService chatService;

    public ChatConfig(String baseUrl, String modelName, double temperature) {
        this.chatService = new ChatService(baseUrl, modelName, temperature);
    }

    public ChatService getChatService() {
        return chatService;
    }

}
