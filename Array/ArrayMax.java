
public class ArrayMax
{
  public static void main(String args[])
  {

     int arr[] = {12, 23, 1, 200, 150};

     int max = arr[0];

     for(int i=0; i<arr.length; i++)
     {
       if(max < arr[i])
       {
          max = arr[i];
       }

     }
     System.out.println("Array Elemets Are ");
     for(int i=0; i<arr.length; i++)
     {
        System.out.print(" "+arr[i]);
     }
    System.out.print("\n Bigger Array Elemnet is "+max); 
  }
}