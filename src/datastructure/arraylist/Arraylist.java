package datastructure.arraylist;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String []args){

        int n = 5;
        ArrayList arrayList
                = new ArrayList(n);

        for(int i =0 ; i < n ; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        arrayList.remove(3);

        for(int i =0 ; i <arrayList.size() ; i++){
            System.out.println(arrayList.get(i) + " ");
        }
    }


}
