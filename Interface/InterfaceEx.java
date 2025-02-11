
interface Animal1
{
  void sound();  
}
interface PI2
{
  void show();
}

class Dog1 implements Animal1,PI2
 {

  public void sound() {
      System.out.println(" Woof... ");
  }
      public void show()
      {
        System.out.println(" Show this... ");
      
  }
 }
public class InterfaceEx 
{
  public static void main(String[] args) 
  {

      Dog1 d2 = new Dog1();
      d2.sound();  
      d2.show(); 
}
}
