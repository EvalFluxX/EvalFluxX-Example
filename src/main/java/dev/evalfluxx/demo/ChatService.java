package dev.evalfluxx.demo;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;

/**
 * Capsule for an Ollama-backed chat model with configurable parameters.
 */
public class ChatService {

    private final ChatModel model;

    public ChatService(String baseUrl, String modelName, double temperature) {
        this.model = OllamaChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(modelName)
                .temperature(temperature)
                .build();
    }

    public String chat(String prompt) {
        return model.chat(prompt);
    }
}
