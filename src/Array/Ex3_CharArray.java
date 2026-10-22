package Array;

public class Ex3_CharArray
{
    public static void main(String[] args)
    {
        char [] ch =new char[5];
        ch[0]='A';
        ch[1]='B';
        ch[2]='C';
        ch[3]='D';
        ch[4]='E';
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        System.out.println(ch[3]);
        System.out.println(ch[4]);

        // to find the length
        System.out.println(ch.length);

        //print all data from array
        for (int i=0;  i<=ch.length-1; i++)
        {
            System.out.println(ch[i]);
        }
    }
}
