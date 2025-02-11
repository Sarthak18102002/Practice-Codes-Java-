public class ArrayDuplicate
 {
    
    public static void main(String[] args)
     {
        int arr[] = {22,52,22,20,50,52};
        int a[]={};

       System.out.println(" Array Elements Are ");
       for(int i=0; i<arr.length; i++)
       {
        System.out.print(" "+arr[i]);
       }
       System.out.println();

        for (int i= 0; i<arr.length; i++) 
        {   
            for(int count=i+1; count<arr.length;count++)
            {
               
               if(arr[count]==arr[i]) 
               {  
                arr[count]=arr[i];
                System.out.print("\nDuplicate Elements Are "+arr[count]);                          
                }
               
            }
           
         }
      }
   }
   
