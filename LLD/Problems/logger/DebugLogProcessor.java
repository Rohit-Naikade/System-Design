package logger;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
        System.out.println("Debug Log Processor constructor called");
    }

    public void log(String level, String message){
        if(level=="Debug"){
            System.out.println("Printing from Debug- "+message);
        }else{
            super.log(message);
        }
    }
}
