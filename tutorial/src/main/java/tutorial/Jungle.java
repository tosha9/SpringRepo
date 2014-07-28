package tutorial;

import java.util.List;

public class Jungle
{
    private Animal largestAnimal;
    private List<Animal> annimals;

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

    @Override
    public String toString ()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Largest Animal is ");
        sb.append(getLargestAnimal().getName());
        sb.append(" and type is ");
        sb.append(getLargestAnimal().getType());
        sb.append(" Contains :\n");

        for (Animal animal : annimals)
        {
            sb.append("Name = ");
            sb.append(animal.getName());
            sb.append("\t");
            sb.append("Type = ");
            sb.append(animal.getType());
            sb.append("\n");
        }

        return sb.toString();
    }

}
