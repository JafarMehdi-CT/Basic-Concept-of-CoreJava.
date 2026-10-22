package Array;

import java.util.Arrays;

public class Ex5_IntArraySorting
{
    public static void main(String[] args)
    {
        int[] ar=new int[5];          // array declaration
        ar[0]=100;                   // array initialization
        ar[1]=300;
        ar[2]=400;
        ar[3]=200;
        ar[4]=500;
        //print all data from array
        for (int i =0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }
        Arrays.sort(ar);

        System.out.println("Sorted array or in accending order");
        for (int i =0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println("Sorted array or in decending order");
        for (int i =ar.length-1;i>=0;i--)
        {
            System.out.println(ar[i]);
        }

    }
}
