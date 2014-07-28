package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{

    public static void main (String[] args)
    {
       
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        
        FruitBasket basket = (FruitBasket)context.getBean("basket");
        
        System.out.println(basket);
 
        ((FileSystemXmlApplicationContext)context).close();
         
    }

}
