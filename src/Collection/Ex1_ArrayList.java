package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class Ex1_ArrayList
{
    // duplicate allow/any no of null accept/storagetype index/maintain the order of insertion
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(25.5);
        al.add( true);
        al.add( 'A');
        al.add(null);
        al.add( null);
        al.add( "Java");
        al.add( 100);
        al.add("Selenium");

        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.contains("Selenium"));
        System.out.println(al.size());

        // toadd the data
        al.set(3,"Phython");
        System.out.println(al);

        // to get the of particular index
        System.out.println(al.get(3));

        // to remove the data from list
        al.remove(4);
        System.out.println(al);

        // print all data by using for loop

        for (int i =0; i<=al.size()-1;i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("------------------");

        //print all data by using for each loop
        for (Object s1:al)
        {
            System.out.println(s1);
        }
        System.out.println("-----------");
        // print all data by using iterator
       Iterator itr =  al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("--------------");
        // Print all data by using listiterator
        ListIterator itr1 = al.listIterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        al.clear();
        System.out.println(al.size());
    }
}
