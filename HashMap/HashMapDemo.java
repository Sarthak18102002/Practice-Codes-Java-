import java.util.*;

public class HashMapDemo 
{
    public static void main(String[] args) 
    {
     HashMap<Integer, String> map=new HashMap<>();
     
     map.put(1, "Sarthak");
     map.put(2, "S");
     map.put(3, "Sk");
     map.put(4, "Sak");
     
     System.out.println(map);
     map.put(2,"M");
     map.remove(3);
     System.out.println(" "+map.containsValue("4"));
          System.out.println(" Map after replacing element " +map);
     
    }
}
