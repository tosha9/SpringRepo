package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{

    public static void main (String[] args)
    {
       
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        System.out.println("Prototype bean");
        
        Person person1 = (Person)context.getBean("person");
        Person person2 = (Person)context.getBean("person");
        
        person1.setTaxId(777);
        
        System.out.println("person1 = "+person1);
        System.out.println("person2 = "+person2);
        
        if(person1 == person2)
        {
            System.out.println("Address of the person bean for both instances is same");
        }
        else
        {
            System.out.println("Different address for different instances");
        }
        
        System.out.println("Conclusion: Prototype bean will give out new instances of object");
        ((FileSystemXmlApplicationContext)context).close();
        
    }

}
