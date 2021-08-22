package com.java.problems;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIndicesSum {

    public static void main(String[] args){
        int[] inputArray= {1,2,3,4,5,6,7,8,9};

        output(inputArray,10);


    }

    public static void output(int[] inputArray, int sum){
        ArrayList<int[]> output = new ArrayList<>();

        int max = inputArray.length-1;
        int min = 0;
        int mid = (max-min)/2;

        int a = 0;
        for (int i= 0;i<mid;i++){
           // System.out.println("Now i:"+i);
            for(int j=max;j>=mid;j--){
//                System.out.println("Now j:"+j);
                if(inputArray[i]+inputArray[j]==sum){
                    System.out.println("{"+i+","+j+"}");
                }
            }

        }


    }
}
