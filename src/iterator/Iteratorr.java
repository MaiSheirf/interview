package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {

    public static void main(String[] args)
    {
        // Creating an ArrayList class object
        // Declaring object of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Iterating over the List
        for (int i = 0; i < 10; i++)
            al.add(i);

        // Printing the elements in the List
        System.out.println(al);

        // At the beginning itr(cursor) will point to
        // index just before the first element in al
        Iterator<Integer> itr = al.iterator();

        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
        while (itr.hasNext()) {
            //  Moving cursor to next element
            int i = itr.next();

            // Getting elements one by one
            System.out.print(i + " ");

            // Removing odd elements
            if (i % 2 != 0)
                itr.remove();
        }

        // Command for next line
        System.out.println();

        // Printing the elements inside the object
        System.out.println(al);
    }
}
