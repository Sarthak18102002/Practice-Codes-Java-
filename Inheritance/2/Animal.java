public class Animal
{
    private String Name;
    private int Age;

    public String getName() 
    {
        return Name;
    }

    public void setName(String Name)
     {
        this.Name =Name;
    }

    public int getAge() 
    {
        return Age;
    }

    public void setAge(int Age) 
    {
        this.Age=Age;
    }
    
    public void eat()
    {
        System.out.println(" \nThis Animal Eats Food ");
    }
    public void woof() //Method Overriding
    {
        System.out.println("");
    }
}


