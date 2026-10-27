package MethodWithReturntype;

public class Sample1
{
    public static void main(String[] args)
    {
        System.out.println(" Static method with return type");
        int num1=add(3,4);
        System.out.println(num1);
        System.out.println(num1*num1);

        System.out.println("non Static method with return type");
        Sample1 s1= new Sample1();
      int mulvalue =s1.mul(5,6);
        System.out.println(mulvalue);

        System.out.println(s1.mul(7,8));

    }

    //Static method with int return type
    public static int add(int a,int b)
    {
        int addvalue=a+b;
        return addvalue ;
    }
//non Static method with return type
    public int mul(int a,int b)
    {
        return a*b;
    }
}
