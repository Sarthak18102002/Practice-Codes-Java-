package One;

class A
{
    public void sayHello()
    {
        System.out.println(" This is A ");
    }
}

class B extends A
{
    public void sayHello()
    {
        System.out.println(" This is B ");
    }
}

class C extends B
{
    public void sayHello()
    {
        System.out.println(" This is C ");
    }
}


public class Test {

    public static void main(String[] args) {

        A a = new A();
        a.sayHello();

        B b=new B();
        b.sayHello();

        C c=new C();
        c.sayHello();
    }
}
