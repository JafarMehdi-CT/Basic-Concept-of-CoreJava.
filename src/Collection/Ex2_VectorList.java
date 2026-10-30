package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex2_VectorList
{
    // duplicate allow/any no of null accept/storagetype index/maintain the order of insertion
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add(25.5);
        v.add( true);
        v.add( 'A');
        v.add(null);
        v.add( null);
        v.add( "Java");
        v.add( 100);
        v.add("Selenium");

        System.out.println(v);
        System.out.println(v.isEmpty());
        System.out.println(v.contains("Selenium"));
        System.out.println(v.size());

        // toadd the data
        v.set(3,"Phython");
        System.out.println(v);

        // to get the of particular index
        System.out.println(v.get(3));

        // to remove the data from list
        v.remove(4);
        System.out.println(v);

        // print all data by using for loop

        for (int i =0; i<=v.size()-1;i++)
        {
            System.out.println(v.get(i));
        }
        System.out.println("------------------");

        //print all data by using for each loop
        for (Object s1:v)
        {
            System.out.println(s1);
        }
        System.out.println("-----------");
        // print all data by using iterator
        Iterator itr =  v.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("--------------");
        // Print all data by using listiterator
        ListIterator itr1 = v.listIterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        v.clear();
        System.out.println(v.size());
    }
}
