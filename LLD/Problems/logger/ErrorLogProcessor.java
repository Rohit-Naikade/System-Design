package logger;

public class ErrorLogProcessor extends logger.LogProcessor {

    public ErrorLogProcessor(logger.LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
        System.out.println("Error Log Processor constructor called");
    }

    public void debug(String level, String message){
        if(level=="Error"){
            System.out.println("Printing from Error - "+message);
        }else{
            super.log(message);
        }
    }
}
