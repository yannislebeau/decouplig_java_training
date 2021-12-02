package fr.lernejo.logger;

public class LoggerFactory {
    private static final String PATH="logs.txt";
    public static Logger getLogger(String name){
        return new CompositeLogger(new ContextualLogger(name, new FileLogger(PATH)), new ContextualLogger(name, new ConsoleLogger()));
    }
}
