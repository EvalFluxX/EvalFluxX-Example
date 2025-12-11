package dev.evalfluxx.demo.evaluation;

import dev.evalfluxx.demo.evaluation.domain.ChatAnswer;
import dev.evalfluxx.demo.evaluation.domain.ChatConfig;
import dev.evalfluxx.demo.evaluation.domain.ChatQuestion;
import dev.evalfluxx.evaluation.results.Processor;

public class ChatProcessor implements Processor<ChatConfig, ChatQuestion, ChatAnswer> {

    @Override
    public ChatAnswer process(ChatConfig config, ChatQuestion question) {
        return new ChatAnswer(config.getChatService().chat(question.getPrompt()));
    }

}
