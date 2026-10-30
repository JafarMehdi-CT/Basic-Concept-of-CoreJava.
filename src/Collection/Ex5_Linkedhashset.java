package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex5_Linkedhashset
{
    public static void main(String[] args)
    {
        //duplicate not allowed/only one null value/storage type hashtable/order random-asscending-maintainorder
        LinkedHashSet hs = new LinkedHashSet();
        hs.add("Selenium");
        hs.add( true);
        hs.add( 'A');
        hs.add(null);
        hs.add( null);
        hs.add( "Java");
        hs.add( 100);
        hs.add("Selenium");
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("Selenium"));
        System.out.println(hs.size());


        System.out.println("------print all data by using for each loop------");
        for (Object h:hs)
        {
            System.out.println(h);
        }


        System.out.println("----print all data by using  Iterator-----");
        Iterator h1 = hs.iterator();
        while (h1.hasNext())
        {
            System.out.println(h1.next());
        }

    }
}
