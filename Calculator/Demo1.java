public class Demo1 
{
    public static void main(String args[])
    {
        Calc obj=new Calc();
        int r1=obj.add(5,6);
        int r2=obj.sub(10,5);
        int r3=obj.mult(3,2);
        int r4=obj.div(10,5);

        System.out.println("Addition is "+r1 +" " +"\nSubstraction is " +r2 + "\nMultiplication is "+r3 +" " +"\nDivision is " +r4);
    }   
}
