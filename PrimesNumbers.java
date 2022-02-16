package com.company.examples;

public class PrimesNumbers {

    public boolean isPrime(int number){
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public void printPrimes(int count){
        for(int i = 2;  i <= count; i ++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public void printFirstNPrimes(int count){
        int start = 2;
        while(count > 0){
            if(isPrime(start)){
                System.out.print(start + " ");
                count--;
            }
            start++;
        }
    }
}
