package Array;

import java.util.Arrays;

public class Ex7_SwapArraydata
{
    public static void main(String[] args) {
        int[] ar=new int[5];          // array declaration
        ar[0]=100;                   // array initialization
        ar[1]=200;
        ar[2]=300;
        ar[3]=400;
        ar[4]=500;
        for (int i =0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println("Sawaping the data");
        int temp=ar[2];
        ar[2]=ar[1];
        ar[1]=temp;
        for (int i =0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
