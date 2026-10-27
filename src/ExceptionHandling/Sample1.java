package ExceptionHandling;

public class Sample1
{
    public static void main(String[] args) {
        int num1 =10;
        int num2=0;
        int div;
        try
        {
            div=num1/num2;

        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmatic exception handled");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException  handled");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        System.out.println("hii");
    }
}
