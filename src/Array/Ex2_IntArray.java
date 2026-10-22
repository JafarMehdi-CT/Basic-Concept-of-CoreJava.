package Array;

public class Ex2_IntArray
{
    public static void main(String[] args)
    {
        int[] ar=new int[5];          // array declaration
        ar[0]=100;                   // array initialization
        ar[1]=200;
        ar[2]=300;
        ar[3]=400;
        ar[4]=500;
        System.out.println(ar[0]);    // array usage
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        System.out.println(ar[3]);
        System.out.println(ar[4]);

        //to find array length
        System.out.println(ar.length);

        // print all data from array
        System.out.println("print all data from array");
        for (int i=0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
