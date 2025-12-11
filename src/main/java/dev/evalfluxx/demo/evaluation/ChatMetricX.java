package dev.evalfluxx.demo.evaluation;

import dev.evalfluxx.demo.evaluation.domain.ChatAnswer;
import dev.evalfluxx.demo.evaluation.domain.ChatQuestion;
import dev.evalfluxx.evaluation.metrics.Metric;
import dev.evalfluxx.evaluation.metrics.MetricResult;

public class ChatMetricX implements Metric<ChatQuestion, ChatAnswer> {

    @Override
    public MetricResult evaluate(ChatQuestion arg0, ChatAnswer arg1) {
        return new MetricResult(getName(), 1.0);
    }

}
