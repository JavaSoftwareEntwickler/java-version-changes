# Java Version Changes 🚀

## 📌 Introduzione
Questo repository è stato creato per evidenziare le principali differenze tra le varie versioni di Java, dalla versione 8 fino alla più recente. Ogni cartella contiene esempi pratici delle nuove funzionalità introdotte, con codice commentato e spiegazioni dettagliate.

L'obiettivo è fornire una risorsa utile per comprendere come il linguaggio si è evoluto nel tempo, facilitando l'apprendimento e la preparazione a colloqui tecnici.

## 📌 Struttura del progetto
```
java-version-changes/
│── README.md
│── Java8/
│   ├── StreamsAPI.java
│   ├── LambdaExpressions.java
│── Java9/
│   ├── ModuleSystem.java
│── Java10/
│   ├── VarKeyword.java
│── Java11/
│   ├── HttpClient.java
│── Java17/
│   ├── RecordClasses.java
│── Java21/
│   ├── VirtualThreads.java
│── pom.xml (per Maven)
│── build.gradle (per Gradle)
```

## 🚀 Esempi di Feature

### Java 8 - Lambda Expressions
```java
import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Ciao, " + name));
    }
}
```

### Java 10 - Var Keyword
```java
public class VarExample {
    public static void main(String[] args) {
        var message = "Hello, Java 10!";
        System.out.println(message);
    }
}
```

### Java 21 - Virtual Threads
```java
public class VirtualThreadsExample {
    public static void main(String[] args) {
        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> System.out.println("Eseguito con Virtual Thread!"));
        }
    }
}
```

## 🔧 Come usare il codice

Clona il repository ed esegui i file con una versione compatibile di Java:
```bash
git clone https://github.com/tuo-username/java-version-changes.git
cd java-version-changes/Java17
javac RecordClasses.java
java RecordClasses
```

## 📜 Principali cambiamenti tra le versioni di Java

### Java 8 (2014)
- Lambda Expressions
- Streams API
- Optional
- Default Methods nelle interfacce
- Nuova API Data e Ora (`java.time`)

### Java 9 (2017)
- Java Platform Module System (JPMS)
- Factory Methods per Collezioni
- JShell (REPL)

### Java 10 (2018)
- Inferenza del tipo locale con `var`

### Java 11 (2018 - LTS)
- Nuova API HTTP Client
- Files API migliorata
- Nuovi metodi per String (`isBlank()`, `lines()`, `strip()`)

### Java 17 (2021 - LTS)
- Sealed Classes
- Pattern Matching avanzato
- Garbage Collector ZGC migliorato

### Java 21 (2023 - LTS)
- Virtual Threads
- Pattern Matching migliorato
- Sequenced Collections
- String Templates (Preview)

## 🔮 Conclusione
- Java 8 e Java 11 sono state rivoluzionarie per il linguaggio.
- Java 17 e Java 21 sono versioni LTS consigliate per ambienti di produzione.
- Le nuove feature puntano a concorrenza, pattern matching e riduzione del boilerplate.

📌 **Sentiti libero di contribuire con PR!** 🚀
