package Array;

public class Ex9_MultidirectionalIntArray
{
    public static void main(String[] args)
    {
      int [] [] ar = new int[3][3];    //3 rows and 3 column
        ar[0][0]=10;
        ar[0][1]=20;
        ar[0][2]=30;
        ar[1][0]=40;
        ar[1][1]=50;
        ar[1][2]=60;
        ar[2][0]=70;
        ar[2][1]=80;
        ar[2][2]=90;
        System.out.println("print all data from matrix");
        for (int i=0;i<=2;i++)   //step1 outer for loop for row start and end index
        {
           for (int j=0; j<=2;j++)  // step 2 inner for loop for column start and end index
           {
               System.out.print(ar[i][j] +  " ");
           }
            System.out.println();
        }


    }
}
