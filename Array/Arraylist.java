import java.util.ArrayList;


 public class Arraylist {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         
         list.add(12);
         list.add(22);
         list.add(33);
         list.add(12);
         list.add(44);
         list.add(55);
         list.add(33);
         list.add(55);
 
         System.out.println("Original List: " + list);
 
         ArrayList<Integer> list2 = new ArrayList<>();
         for (int num : list) 
         {
             if (!list2.contains(num)) {
                 list2.add(num);
             }
         }
 
         System.out.println("List after removing duplicates: " + list2);
     }
 }