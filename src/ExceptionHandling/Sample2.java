package ExceptionHandling;

public class Sample2
{
    public static void main(String[] args)
    {
        int[] ar={2,3,6,5};
        System.out.println(ar[2]);

        try
        {
            System.out.println(ar[4]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmatic exception handled");
        }

        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        System.out.println(ar.length);

    }
}
