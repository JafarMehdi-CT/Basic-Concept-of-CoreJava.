package Array;

import java.util.Arrays;

public class Ex6_StringArraySorting
{
    public static void main(String[] args)
    {
        String[] ar= new String[5];  //array declaration
        ar[0]="Ali";                 // array intialization
        ar[1]="Hiba";
        ar[2]="Hasnain";
        ar[3]="Alina";
        ar[4]="Jafar";

        for (int i =0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }
        Arrays.sort(ar);
        System.out.println("Sorted string");
        for (int i =0;i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
