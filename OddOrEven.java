package com.company.examples;

public class OddOrEven {

    public String modOddOrEven(int number){
        return ((number % 2) == 0) ? "Is Even" : " Is Odd";
    }

    public String divisionOddOrEven(int number){
        int temp = number / 2;
        return (temp * 2 == number) ? "Is Even" : " Is Odd";
    }

    public String bitwiseOddOrEven(int number){
        return ((number & 1) ==0) ? "Is Even" : " Is Odd";
    }

    /**
     * Integers are represented as 2's complement and even numbers has 0 as LSB(least significant bit).
     * If you perform a bitwise AND(&) between a number and 1, the result will be zero if the number is even.
     */
}
