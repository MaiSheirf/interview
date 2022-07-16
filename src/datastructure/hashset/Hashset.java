package datastructure.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {

    public static void main(String[] args)
    {
        // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();

        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);

        // print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println(set.size());
    }
}
