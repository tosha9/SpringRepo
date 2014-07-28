package tutorial;

import java.util.Map;

public class Jungle
{
    private Animal largestAnimal;
    private Map<Animal, String> annimals;

    private Map<String, String> foods;
    
    
    public Animal getLargestAnimal ()
    {
        return largestAnimal;
    }

    public void setLargestAnimal (Animal largestAnimal)
    {
        this.largestAnimal = largestAnimal;
    }

    public Map<Animal, String> getAnnimals ()
    {
        return annimals;
    }

    public void setAnnimals (Map<Animal, String> annimals)
    {
        this.annimals = annimals;
    }

    
    public Map<String, String> getFoods ()
    {
        return foods;
    }

    public void setFoods (Map<String, String> foods)
    {
        this.foods = foods;
    }

    @Override
    public String toString ()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Largest Animal is :\n");
        sb.append(getLargestAnimal());
        sb.append(" Contains :\n");

        for (Map.Entry<Animal, String> entry: annimals.entrySet())
        {
            sb.append(entry.getKey()+" and "+entry.getValue()+"\n");
            sb.append("\n");
        }
        
        for(Map.Entry<String, String> entry: foods.entrySet())
        {
            sb.append(entry.getKey()+" eats "+entry.getValue()+"\n");
        }

        return sb.toString();
    }

}
