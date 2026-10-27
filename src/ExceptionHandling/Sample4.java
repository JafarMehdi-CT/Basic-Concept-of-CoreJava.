package ExceptionHandling;

public class Sample4
{
    // genric exception

    public static void main(String[] args)
    {
        int[] ar={5,6,7,8};
        System.out.println(ar.length);
        System.out.println(ar[2]);
        try
        {
            System.out.println(ar[4]);
        }
        catch (Exception e)
        {
            System.out.println("Exception handled");
            e.printStackTrace();
        }
        System.out.println("print all data from array");
        for (int i=0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }

    }
}
