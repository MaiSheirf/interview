package datastructure.arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args){

        //1d array

        int [] oneArray;
        oneArray = new int[] {1,2,3,4,5,6};

        System.out.println("1d array");
        for(int i =0 ; i <oneArray.length ; i++){
            System.out.println(oneArray[i]);
        }
        System.out.println("\n");

        //2d array

        int [][] twoAraay;
        twoAraay = new int[][]{
                {2, 7, 9},
                {5, 8, 10}
        };

        System.out.println("2d array");
        for(int i =0 ; i <twoAraay.length ; i++){
            for(int j =0 ; j<twoAraay.length ; j++){
                System.out.println(twoAraay[i][j]);
            }
        }
        System.out.println("\n");

        //subarray
        int[] src = new int[] {1, 2, 3, 4, 5};
        int b1[] = Arrays.copyOfRange(src, 0, 2);

        System.out.println("sub array");
        for(int i =0 ; i< b1.length ; i++){
            System.out.println(b1[i]);
        }
    }
}
