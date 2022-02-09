package com.company.examples;
/**
 * Factorial:
 * n! = n * n-1
 * e.g 5! = 5 * 4 * 3 * 2 * 1 = 120
 *
 * note: 0! = 1
 */
public class Factorial {

    public int recursiveFactorial(int number){
        if(number == 0){
            return 1;
        }
        return number * recursiveFactorial(number - 1);
    }

    public int iterativeFactorial(int number){
        int fact = 1;
        for(int i = 2; i <= number; i++){
            fact = fact * i;
        }
        return fact;
    }

    public int ternaryOpFactorial(int number){
        return number == 0 ? 1 : number * ternaryOpFactorial(number - 1);
    }
}
