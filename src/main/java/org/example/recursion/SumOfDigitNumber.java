package org.example.recursion;

public class SumOfDigitNumber {
    public static void main(String[] args) {
        int num=123456;
        System.out.println(sumOfDigitOfNumber(num));
    }
    static int sumOfDigitOfNumber(int n){
        if (n==0)
            return 0;
        return (n%10+sumOfDigitOfNumber(n/10));
    }
}
