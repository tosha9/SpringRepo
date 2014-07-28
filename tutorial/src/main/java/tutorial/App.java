package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{

    public static void main (String[] args)
    {
       
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        
        Person person = (Person)context.getBean("person");
        
        person.setTaxId(777);
        
        System.out.println("person = "+person);
      
        
        ((FileSystemXmlApplicationContext)context).close();
        
    }

}
