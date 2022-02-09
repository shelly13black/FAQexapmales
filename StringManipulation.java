package com.company.examples;

public class StringManipulation {

    public String charArrayReverseString(String s){
        char [] c = s.toCharArray();
        String newString = "";
        for(int i = c.length-1; i >= 0 ; i--) {
            newString += c[i];
        }
        return newString;
    }

    public String builderReverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public String bufferReverseString(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

    public boolean isPalindrome(String s){
        int first = 0;
        int last = s.length() - 1;
        while(first <= last){
            if(s.charAt(first) != (s.charAt(last))){
                return false;
            }
            first ++;
            last --;
        }
        return true;
    }
}
