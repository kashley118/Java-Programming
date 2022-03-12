package com.company;

import java.util.Scanner;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int []arrayInt = getInteger(4);
        int [] sorted = sortArray(arrayInt);
        printArray(sorted);
    }

    public static int [] getInteger(int num){
        int []values = new int[num];
        System.out.println("Enter " + num + " values");
        for(int i= 0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;

    }

    public static void printArray(int[]arr){

        for(int i =0; i<arr.length; i++){
            System.out.println("Element " + i + " sorted value "+ arr[i]);
        }
    }
    public static int []sortArray(int []array){


        int []sortedArray = new int[array.length];
        for(int i= 0; i< array.length; i++){
            sortedArray[i] = array[i];

        }
        boolean flag = true;
        int temp =0;
        while(flag){
            flag = false;
            for(int i = 0 ; i< sortedArray.length -1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i +1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;


    }
}
