package dev.evalfluxx.demo;

/**
 * Einstiegspunkt für ein Ollama-gestütztes Chat-Beispiel mit LangChain4j.
 */
public class App {

    private static final String DEFAULT_BASE_URL = "http://localhost:11434";
    private static final String DEFAULT_MODEL_NAME = "llama3";
    private static final double DEFAULT_TEMPERATURE = 0.7;

    public static void main(String[] args) {
        String baseUrl = System.getProperty("ollama.base-url", getenvOrDefault("OLLAMA_BASE_URL", DEFAULT_BASE_URL));
        String modelName = System.getProperty("ollama.model", getenvOrDefault("OLLAMA_MODEL", DEFAULT_MODEL_NAME));
        double temperature = parseDoubleOrDefault(System.getProperty("ollama.temperature"),
                getenvOrDefault("OLLAMA_TEMPERATURE", null), DEFAULT_TEMPERATURE);

        ChatService chatService = new ChatService(baseUrl, modelName, temperature);
        String response = chatService.chat("Hallo! Kannst du mir erklären, was EvalFluxX macht?");
        System.out.println(response);
    }

    private static String getenvOrDefault(String key, String defaultValue) {
        String value = System.getenv(key);
        return (value == null || value.isBlank()) ? defaultValue : value;
    }

    private static double parseDoubleOrDefault(String sysProp, String envValue, double defaultValue) {
        for (String candidate : new String[]{sysProp, envValue}) {
            if (candidate != null && !candidate.isBlank()) {
                try {
                    return Double.parseDouble(candidate);
                } catch (NumberFormatException ignored) {
                    // fall through to next candidate
                }
            }
        }
        return defaultValue;
    }
}
