package Array;

public class Ex1_IntArraInSingleLine
{
    public static void main(String[] args)
    {

//        int[] ar = {5, 6, 7};    //one dimensional array declartion and intialization in a single line
//
//        System.out.println(ar.length);
//        System.out.println(ar[2]);
//        System.out.println("print all data");
//
//        //print all data
//        for (int i=0;i<=2 ;i++)
//        {
//            System.out.println(ar[i]);
//        }

         int[][] ar= {{5,6,7},{8,9,4}};//two dimension in a single line
        System.out.println(ar[0][2]);
        System.out.println(ar.length);
        System.out.println("print all data");

        for (int i=0;i<=1;i++)
        {
            for (int j=0;j<=2;j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }


    }
}
