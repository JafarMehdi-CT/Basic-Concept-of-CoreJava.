package Interface_Implementation;

public class Implementation_Class implements Interface_Class1,Interface_Class2
{
    @Override
    public void m1()
    {
        System.out.println("method m1 from InterfaceClass1 completed in IC ");
    }

    @Override
    public void m2()
    {
        System.out.println("method m2 from InterfaceClass1 completed in IC");
    }

    @Override
    public void m3()
    {
        System.out.println("method m3 from InterfaceClass2 completed in IC");
    }

    @Override
    public void m4()
    {
        System.out.println("method m4 from InterfaceClass2 completed in IC");
    }
}
