package StaticKeyword;

public class Example
{
    public static int max(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
}
class Test
{
public static void main(String[] args)
{
    System.out.println(" Maximum No is"+Example.max(2,4));

}
}
