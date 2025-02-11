import java.util.*;
class Palindrome3
{  
       public static void main(String args[])    
       {    
          String original, rev = ""; 

          Scanner in = new Scanner(System.in);     

          System.out.println("Enter a string ");   
          original = in.nextLine();    

          //int length = original.length(); 
          
          if (original.length()%2==3 || original.length()%2!=0 || original.length()%2==0)
         {
          for ( int i = original.length()- 1; i >= 0; i-- )    
             rev = rev + original.charAt(i);    
          if (original.equals(rev))    
             System.out.println(" Palindrome ");    
          else    
             System.out.println(" Not Palindrome ");     
       }    
    } 
}
