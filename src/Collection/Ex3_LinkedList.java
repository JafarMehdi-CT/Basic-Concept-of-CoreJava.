package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex3_LinkedList
{
    // duplicate allow/any no of null accept/storagetype index/maintain the order of insertion
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(25.5);
        l.add( true);
        l.add( 'A');
        l.add(null);
        l.add( null);
        l.add( "Java");
        l.add( 100);
        l.add("Selenium");

        System.out.println(l);
        //print all data by using for loop
        System.out.println("-----by using for loop-----");
        for (int i=0;i<=l.size()-1;i++)
        {
            System.out.println(l.get(i));
        }

        System.out.println("------by using by for eachloop-------");
        //print all data by using by for eachloop
        for (Object s1:l)
        {
            System.out.println(s1);
        }

        System.out.println("-----by using listIterator--------");
        ListIterator l1 = l.listIterator();
        while (l1.hasNext())
        {
            System.out.println(l1.next());
        }

        System.out.println("-----by using Iterator--------");
        Iterator l2 = l.iterator();
        while (l2.hasNext())
        {
            System.out.println(l2.next());
        }

        l.clear();
        System.out.println(l.size());

    }
}
