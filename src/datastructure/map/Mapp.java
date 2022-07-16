package datastructure.map;

import java.util.HashMap;
import java.util.Map;

public class Mapp {

    public static void main(String [] args){

        Map hm = new HashMap();

        hm.put("a" , 100);
        hm.put("b" , 101);

        //java 8
        hm.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
