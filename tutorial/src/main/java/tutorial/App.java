package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{

    public static void main (String[] args)
    {
       
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        
        Person person = (Person)context.getBean("person2");
        
        System.out.println("person = "+person);
        
        Address address = (Address)context.getBean("address2");
        
        System.out.println(address);
     
        ((FileSystemXmlApplicationContext)context).close();
        
        
        
    }

}
