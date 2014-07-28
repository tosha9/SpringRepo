package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{

    public static void main (String[] args)
    {
       
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        System.out.println("Singleton bean");
        
        Person person1 = (Person)context.getBean("person");
        Person person2 = (Person)context.getBean("person");
        
        person1.setTaxId(777);
        
        System.out.println("person1 = "+person1);
        System.out.println("person2 = "+person2);
        
        if(person1 == person2)
        {
            System.out.println("Address of the person bean for both instances is same");
        }
        
        System.out.println("Conclusion: No matter how may times we call person Spring will rteturn same bean");
        ((FileSystemXmlApplicationContext)context).close();
        
    }

}
