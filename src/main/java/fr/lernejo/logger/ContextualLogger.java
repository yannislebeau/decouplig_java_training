package fr.lernejo.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContextualLogger implements Logger {

    private String callerClass;
    private Logger logger;
    private String formatter = "yyyy-MM-dd HH:mm:ss.SSS";

    @Override
    public void log(String message) {

        SimpleDateFormat sdfDate = new SimpleDateFormat(formatter);
        Date now = new Date();
        String strDate = sdfDate.format(now);


        this.logger.log("[" + strDate + "] " + callerClass + " > " + message);
    }

    public ContextualLogger(String classname, Logger logger) {
        this.callerClass = classname;
        this.logger = logger;
    }
}
