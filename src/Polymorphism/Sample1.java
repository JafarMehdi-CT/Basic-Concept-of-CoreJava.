package Polymorphism;

public class Sample1
{
    public void m1()
    {
        System.out.println("Compile time");
    }
    public static void m2()
    {
        System.out.println( "Static method");
    }

    public static void main(String[] args)
    {
        Sample1 s1 =new Sample1();
        s1.m1();
        m2();
    }
}
