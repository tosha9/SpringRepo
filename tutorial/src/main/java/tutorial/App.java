package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{

    public static void main (String[] args)
    {
       
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        System.out.println("Adding Init and destroy method");
        
        System.out.println("Spring only destroys singleton bean and not prototype bean when context is closed");
        
        Person person1 = (Person)context.getBean("person");
        
        person1.setTaxId(777);
        
        System.out.println("person1 = "+person1);
      
        
        ((FileSystemXmlApplicationContext)context).close();
        
    }

}
