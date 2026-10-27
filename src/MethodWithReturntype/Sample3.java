package MethodWithReturntype;

public class Sample3
{
    public static void main(String[] args)
    {
        Sample3 s= new Sample3();
        String []  ar1 =s.Studentname();
        System.out.println(ar1[1]);
    }
    public String [] Studentname()
    {
        String [] ar = {"Jafar","Haider","Mehdi" };
        return ar;
    }
}
