package datastructure.list;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args){
        List li = new ArrayList();

        li.add(0,1);
        li.add(1,2);

        System.out.println(li);

        List l2 = new ArrayList();


        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        li.addAll(1, l2);

        System.out.println(li);


        li.remove(1);

        // Printing the updated List 1
        System.out.println(li);


        System.out.println(li.get(3));

        // Replace 0th element with 5
        // in List 1
        li.set(0, 5);


        System.out.println(li);
    }
}
