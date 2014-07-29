package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import autowiring.logger;

public class App
{

    public static void main (String[] args)
    {
       
        ApplicationContext context = new FileSystemXmlApplicationContext("autowiring.xml");
           
        logger l = (logger)context.getBean("logger");
        
        l.consoleWrite("Console write ");
        l.fileWrite("Console is blah blah");
 
        ((FileSystemXmlApplicationContext)context).close();
         
    }

}
