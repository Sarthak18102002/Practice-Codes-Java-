package Array;

import java.util.Scanner;


    public class ArrayAdd1

    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int sum=0;
            int al[]={2,3,7,10,8,9};
            int n=al.length;

            for(int i=0;i<n;i++)
            {
                System.out.print(" "+al[i]);
            }
            System.out.print("\n");

            System.out.print(" Enter No ");
            int no=sc.nextInt();

            for(int i=0;i<al.length;i++)
            {
                for (int j = i + 1; j < al.length; j++)
                {
                    if ((al[i]) + (al[j])==no)

                        System.out.println(" " + al[i] + " " + al[j]);
//                    else
//                        System.out.println(" Wrong ");

                }

            }
        }
    }


