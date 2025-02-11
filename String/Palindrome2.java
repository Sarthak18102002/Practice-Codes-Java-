import java.util.*;
public class Palindrome2
{
    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length()-1;


        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right))
             {    
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter String ");
        String testStr=sc.next();

        
        if (isPalindrome(testStr))
         {
            System.out.println(testStr + " is a palindrome.");
        } 
        else 
        {
            System.out.println(testStr + " is not a palindrome.");
        }
    }
}