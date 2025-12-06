# 🚀 EvalFluxX Demo Project
Ein vollständiges Beispielprojekt, das zeigt, wie EvalFluxX in einer echten Anwendung eingesetzt wird.

## 📌 Ziel des Projekts
Dieses Repository dient als **hands-on Beispiel**, um zu demonstrieren, wie EvalFluxX verwendet werden kann, um:
- eine Beispielapplikation automatisiert zu testen
- eigene Evaluations-Prompts und Metriken zu definieren
- Pipelines für wiederholbare Evals aufzubauen
- Ergebnisse strukturiert auszuwerten

Das Projekt ist bewusst klein und überschaubar gehalten, sodass es ideal zum Lernen und Experimentieren ist.

---

## 🧪 Beispiel-Evaluations

Das Projekt enthält u. a. folgende Beispiel-Evals:

### **Functional-Eval**
Überprüft, ob die App auf bestimmte Eingaben die erwarteten Ausgaben liefert.

### **Explanation-Eval**
Bewertet die Qualität der KI-Erklärungen oder Nutzerausgaben.

---

## 🛠️ Einrichtung

1. Java 17 installieren und sicherstellen, dass `JAVA_HOME` gesetzt ist.
2. Maven installieren.
3. Optional: [Ollama](https://ollama.ai/) lokal mit einem Modell wie `llama3` starten (`ollama run llama3`).

## ▶️ Ausführen

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="dev.evalfluxx.demo.App"
# führt EvalFluxX Evals aus (Konfiguration via evalfluxx-plugin)
mvn evalfluxx:run
```

Die Beispiel-Implementierung nutzt LangChain4j, um über Ollama einen Chat-Aufruf abzusetzen. Modellname, Base-URL und Temperatur
lassen sich über die System-Properties `ollama.model`, `ollama.base-url`, `ollama.temperature` oder die entsprechenden
Environment-Variablen `OLLAMA_MODEL`, `OLLAMA_BASE_URL`, `OLLAMA_TEMPERATURE` anpassen.
Die Abhängigkeit zu EvalFluxX ist bereits in der `pom.xml` hinterlegt und kann für eigene Evaluations erweitert werden.
