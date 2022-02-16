package com.company.examples;

public class FibonacciSequence {

    public int printOneAtPositionN(int position){
        int first = 0;
        int second = 1;
        for(int i = 2; i < position; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    public void printFirstNInSequence(int count){
        int first = 0;
        int second = 1;
        for(int i = 0; i < count; i++){
            System.out.print(first + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}
