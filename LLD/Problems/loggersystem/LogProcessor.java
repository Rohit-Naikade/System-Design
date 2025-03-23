public class LogProcessor {
    LogProcessor nextLogProcessor;
    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor=nextLogProcessor;
        System.out.println("Log Processor constructor called");
    }

    public void log(String loglevel,String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(loglevel, message);
        }
    }
}
