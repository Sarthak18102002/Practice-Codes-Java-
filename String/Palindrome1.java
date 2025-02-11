import java.util.*;
class Palindrome1
{  
       public static void main(String args[])    
       {    
          String original, rev = ""; 

          Scanner in = new Scanner(System.in);     

          System.out.println("Enter a string ");   
          original = in.nextLine();    

          int length = original.length(); 
              
          for ( int i = length - 1; i >= 0; i-- )    
             rev = rev + original.charAt(i);    
          if (original.equals(rev))    
             System.out.println(" Palindrome ");    
          else    
             System.out.println(" Not Palindrome ");     
       }    
    } 