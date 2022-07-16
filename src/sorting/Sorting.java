package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    public static void main(String [] args){

        int [] array = {4,3,2,1};

        //normal sort
        for(int i =0 ; i <array.length ; i++){
            for(int j = i+1 ; j<array.length ;j++){
                int temp =0 ;
                if(array[j] < array[i]){
                    temp = array[i];
                    array[j]= array [i];
                    array[j] = temp;
                }
            }
            System.out.println(array[i] + " ");
        }
        //sort of arrays class
        Arrays.sort(array);
        System.out.println(array);

        //sort of collection class
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
        Collections.sort(al);

        System.out.println(al);

        //subarray
        Arrays.sort(array, 1, 3);
        System.out.println(array);
    }
}
