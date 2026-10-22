package Array;

public class Ex1_StringArray
{
    public static void main(String[] args)
    {
        String[] ar= new String[5];  //array declaration
        ar[0]="Ali";                 // array intialization
        ar[1]="Hiba";
        ar[2]="Hasnain";
        ar[3]="Alina";
        ar[4]="Jafar";
        System.out.println(ar[0]);    // array usage
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        System.out.println(ar[3]);
        System.out.println(ar[4]);

        //reintaialize
        ar[2]="Sara";
        System.out.println(ar[2]);

        // to find array length
        System.out.println(ar.length);

        System.out.println("print all data from array");

        for (int i =0; i<=ar.length-1;i++)
        {
            System.out.println(ar[i]);
        }

    }
}
