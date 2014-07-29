package autowiring;

public class logger
{   
    private ConsoleWritter consoleWritter;
    private ConsoleWritter consoleWritterOther;
    private FileWritter fileWritter;
    
    public logger(ConsoleWritter consoleWritter, FileWritter fileWritter)
    {
        this.consoleWritter = consoleWritter;
        this.fileWritter = fileWritter;
    }
    
    public logger()
    {
        // TODO Auto-generated constructor stub
    }
    
    public ConsoleWritter getConsoleWritter ()
    {
        return consoleWritter;
    }
    public void setConsoleWritter (ConsoleWritter consoleWritter)
    {
        this.consoleWritter = consoleWritter;
    }
    public FileWritter getFileWritter ()
    {
        return fileWritter;
    }
    public void setFileWritter (FileWritter fileWritter)
    {
        this.fileWritter = fileWritter;
    }
    
    public void consoleWrite (String text)
    {
        consoleWritter.write(text);
    }
    
    public void consoleOtherWrite (String text)
    {
        consoleWritterOther.write(text);
    }
    

    public void fileWrite (String text)
    {
        fileWritter.write(text);
    }
    public ConsoleWritter getConsoleWritterOther ()
    {
        return consoleWritterOther;
    }
    public void setConsoleWritterOther (ConsoleWritter consoleWritterOther)
    {
        this.consoleWritterOther = consoleWritterOther;
    }
    
    
    
}
