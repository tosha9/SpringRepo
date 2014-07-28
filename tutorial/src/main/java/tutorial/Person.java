package tutorial;

public class Person
{
    private int id;
    private String name;

    private Address address;

    public int taxId;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Person()
    {
        System.out.println("I am a constructor");
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void speak ()
    {
        System.out.println("I am a person");
    }

    public void onCreate ()
    {
        System.out.println("Person Created " + this);
    }

    public void onDestroy ()
    {
        System.out.println("Person destroyed");
    }

    @Override
    public String toString ()
    {
        return "Person [id=" + id + ", name=" + name + ", address=" + address + ", taxId=" + taxId + "]";
    }

    public void setTaxId (int taxId)
    {
        this.taxId = taxId;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    public static Person getInstance ( int id, String name)
    {
        System.out.println("Creating Person using factory method");
        return new Person(id, name);
    }

}
