package Casting;

public class TestUpcasting
{
    public static void main(String[] args)
    {
//        Son s =new Son();
//        s.car();
//        s.money();
//        s.home();
//        s.mobile();
        // create an object of subclass w r t super class for upcasting
        Father f= new Son();
        f.car();
        f.money();
        f.home();
    }
}
