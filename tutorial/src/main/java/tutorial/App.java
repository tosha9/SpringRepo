package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{

    public static void main (String[] args)
    {
       
        ApplicationContext context = new FileSystemXmlApplicationContext("bean2.xml");
           
        Jungle jungle = (Jungle)context.getBean("jungle");
        
        System.out.println(jungle);
 
        ((FileSystemXmlApplicationContext)context).close();
         
    }

}
