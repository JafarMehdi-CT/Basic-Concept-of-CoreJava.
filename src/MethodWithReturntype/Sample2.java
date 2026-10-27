package MethodWithReturntype;

public class Sample2
{
    public static void main(String[] args)
    {
       String s1=studentname();
        System.out.println(s1);

        System.out.println(studentname());
    }
    public static String studentname()
    {
        String name="Haider";
        return name ;
    }
}
