package tutorial;

import java.util.List;

public class FruitBasket
{
    private String name;
    private List<String> fruits;
    
    public FruitBasket(String name, List<String> fruits)
    {
        this.name = name;
        this.fruits = fruits;
    }
    
    @Override
    public String toString ()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("name");
        sb.append("contains :\n");
        
        for(String fruit: fruits)
        {
            sb.append(fruit);
            sb.append("\n");
        }
        
        return sb.toString();
    }
    public String getName ()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public List<String> getFruits ()
    {
        return fruits;
    }
    public void setFruits (List<String> fruits)
    {
        this.fruits = fruits;
    }
    
    

}
