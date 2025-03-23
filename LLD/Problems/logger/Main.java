package loggersystem;

public class Main {
    public static void main(){
        logger.LogProcessor processor=new logger.LogProcessor(new logger.InfoLogProcessor(new logger.DebugLogProcessor(new logger.ErrorLogProcessor(null))));
    }
}
