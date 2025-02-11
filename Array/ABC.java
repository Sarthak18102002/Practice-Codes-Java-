
import java.util.*;
public class ABC
{
    public static void main(String[] args) 
    {
   
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();
   

        a.add(12);
        a.add(22);
        a.add(32);
        a.add(42);
        a.add(52);
        System.out.print("Array List is "+a);
        //System.out.print("\nArray List is "+b);

        for(int i=0; i<a.size(); i++)
        {
            for(int count=i+1; count<a.size(); count++)
            {
                if(a.get(i).equals(a.get(count)))
                {           
                    System.out.print("\nArray List is "+a.get(i));
                }
               
        }

    }
}     
}
