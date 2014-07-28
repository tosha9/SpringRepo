package tutorial;

public class PersonFacory
{
    public Person createPerson (int id, String name)
    {
        System.out.println("Using factory Bean");
        return new Person(id, name);
        
    }
}
