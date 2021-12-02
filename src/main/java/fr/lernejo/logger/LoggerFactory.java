package fr.lernejo.logger;

public class LoggerFactory {
    private static final String PATH="logs.txt";
    public static Logger getLogger(String name){
        ContextualLogger contextualLogger = new ContextualLogger(name, new FileLogger(PATH));
        return contextualLogger;
    }
}
