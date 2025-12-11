package dev.evalfluxx.demo.evaluation;

import java.util.stream.Stream;

import dev.evalfluxx.demo.evaluation.domain.ChatConfig;
import dev.evalfluxx.evaluation.config.ConfigurationProvider;

public class ChatConfigurationProvider implements ConfigurationProvider<ChatConfig> {
    @Override
    public Stream<ChatConfig> getConfigurations() {
        return Stream.of(new ChatConfig("http://localhost:11434", "llama3", 0.7));
    }
}
