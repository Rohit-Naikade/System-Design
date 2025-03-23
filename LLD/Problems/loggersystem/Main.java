public class Main {
    public static void main(String args[]){
        LogProcessor processor=new LogProcessor(new InfoLoggerProcessor(new DebugLogProcessor(new ErrorLogProcessor(null))));

        processor.log("Error","[error message]");
        processor.log("Info","[info message]");
        processor.log("Debug","[debug message]");

    }

}