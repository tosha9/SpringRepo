package autowiring;

public class logger
{   
    private ConsoleWritter consoleWritter;
    private FileWritter fileWritter;
    
    
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
    

    public void fileWrite (String text)
    {
        fileWritter.write(text);
    }
    
    
}
