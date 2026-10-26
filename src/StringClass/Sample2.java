package StringClass;

public class Sample2
{
    public static void main(String[] args)
    {
        String s1="Himalaya";
        String s2="ABCD";
        String s3="abcd";
        String s4="  ";
        String s5="My Name Is Peter";

        System.out.println(s1.toUpperCase());
//        s1=s1.toUpperCase();     // reinitialize
//        System.out.println(s1);
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println("-------------");

        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("a"));
        System.out.println("-------------");

        System.out.println(s4.isEmpty());
        System.out.println("-------------");

        System.out.println(s5.length());
        System.out.println(s5.contains("Peter"));
        System.out.println(s5.replace("Peter","Jack"));

        System.out.println("-------------");
        String[] ar = s5.split( " ");
        System.out.println(ar.length);
        System.out.println(ar[3]);


    }
}
