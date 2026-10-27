package ExceptionHandling;

public class Sample3
{
    public static void main(String[] args)
    {
        String s1="Fortuner";
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        try
        {
            System.out.println(s1.charAt(8));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmatic exception handled");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException  handled");
        }

        System.out.println(s1.startsWith("F"));


    }
}
