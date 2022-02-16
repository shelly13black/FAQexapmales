package com.company.examples;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArray {

    public int [] usingArraySort(int [] arr){
        Arrays.sort(arr);
        return arr;
    }

    public Integer [] usingCollectionReverse(Integer [] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public int [] loopAndSwapSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
