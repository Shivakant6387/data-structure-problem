package org.example.recursion;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        int n=factorial(num);
        System.out.println(n);
    }
    static int factorial(int num){
        if (num<=0)
            return 1;
        return num*factorial(num-1);
    }
}
