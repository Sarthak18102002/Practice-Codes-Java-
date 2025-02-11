public class Test 
{
    public static void main(String args[])
    {
        Child c=new Child();
        c.setName(" Sarthak");
        c.setAge(25);

       

        Parent p = new Parent();
        p.setName(" Mukesh");
        p.setAge(40);
        p.show();

       
        System.out.println(" Age is "+c.getAge()+" " +" \n Name is "+c.getName());
        System.out.println(" Age is "+p.getAge()+" " +" \n Name is "+p.getName());
    }
    
}

