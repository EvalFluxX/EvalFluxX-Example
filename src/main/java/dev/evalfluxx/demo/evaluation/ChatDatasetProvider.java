package dev.evalfluxx.demo.evaluation;

import java.util.stream.Stream;

import dev.evalfluxx.demo.evaluation.domain.ChatQuestion;
import dev.evalfluxx.evaluation.datasets.DatasetProvider;

public class ChatDatasetProvider implements DatasetProvider<ChatQuestion> {

    @Override
    public Stream<ChatQuestion> getDatasets() {
        return Stream.of(new ChatQuestion("Was geht so?"));
    }

}
