package Array;

public class Ex4_PrintArrayInReverseOrder
{
    public static void main(String[] args)
    {
        int [] ar = new int[5];
        ar[0]=100;
        ar[1]=200;
        ar[2]=300;
        ar[3]=400;
        ar[4]=500;
        System.out.println("print array in same order");
        for (int i=0;i<ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("print array in  reverse order");
        for (int i=ar.length-1;i>=0;i--)
        {
            System.out.println(ar[i]);
        }
    }
}
