package fr.lernejo.logger;

public class CompositeLogger implements Logger{
    private static Logger file;
    private static Logger console;
    private static String message;
    public CompositeLogger(Logger file, Logger console){
        this.file = file;
        this.console=console;
    }
    public void log(String message){
        file.log(message);
        console.log(message);
    }
}
