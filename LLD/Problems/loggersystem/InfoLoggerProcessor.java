public class InfoLoggerProcessor extends LogProcessor{

    public InfoLoggerProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
        System.out.println("Info Log Processor constructor called");
    }

    public void log(String level, String message){
        if(level=="Info"){
            System.out.println("Printing from Info- "+message);
        }else{
            super.log(level, message);
        }
    }
}
