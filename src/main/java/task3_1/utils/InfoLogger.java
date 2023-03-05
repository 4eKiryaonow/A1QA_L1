package task3_1.utils;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InfoLogger {

    private final static Logger logger = LogManager.getLogger();

    public static void infoMessage(String message){logger.log(Level.INFO, message);}
}
