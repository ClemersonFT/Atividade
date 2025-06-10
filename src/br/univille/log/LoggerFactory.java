package br.univille.log;

public class LoggerFactory {
    public static Logger onConsole(){
        LoggerConsole consoleLogger = new LoggerConsole();
        return consoleLogger;
    }
    public static Logger onFile(){
        LoggerFile fileLogger = new LoggerFile();
        return fileLogger;
    }
}
