public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
        System.out.println("Error Log Processor constructor called");
    }

    public void log(String level, String message){
        if(level=="Error"){
            System.out.println("Printing from Error - "+message);
        }else{
            super.log(level, message);
        }
    }
}
