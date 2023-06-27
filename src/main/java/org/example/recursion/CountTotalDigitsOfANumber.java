package org.example.recursion;

public class CountTotalDigitsOfANumber {
    public static void main(String[] args) {
        long n = 345289467;
        System.out.print("Number of digits : "
                + countTotalDigitInANumber(n));
    }
    public static int countTotalDigitInANumber(long num){
        int count=0;
        while(num!=0){
            num=num/10;
            ++count;
        }
        return count;
    }
}
