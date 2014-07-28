package tutorial;

import java.util.List;
import java.util.Map;

public class Jungle
{
    private Animal largestAnimal;
    private List<Animal> annimals;

    private Map<String, String> foods;
    
    
    public Animal getLargestAnimal ()
    {
        return largestAnimal;
    }

    public void setLargestAnimal (Animal largestAnimal)
    {
        this.largestAnimal = largestAnimal;
    }

    public List<Animal> getAnnimals ()
    {
        return annimals;
    }

    public void setAnnimals (List<Animal> annimals)
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

        for (Animal animal : annimals)
        {
            sb.append(animal);
            sb.append("\n");
        }
        
        for(Map.Entry<String, String> entry: foods.entrySet())
        {
            sb.append(entry.getKey()+" eats "+entry.getValue()+"\n");
        }

        return sb.toString();
    }

}
