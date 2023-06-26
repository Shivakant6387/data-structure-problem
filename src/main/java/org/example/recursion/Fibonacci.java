package org.example.recursion;

public class Fibonacci {
    static int fib(int nums){
        if (nums==0)
            return 0;
        if (nums==1||nums==2)
            return 1;
        else
            return (fib(nums-1)+fib(nums-2));
    }
    public static void main(String[] args) {
        int nums=5;
        System.out.println("Fibonacci series of "+nums+"numbers is");
        for (int i=0;i<nums;i++){
            System.out.print(fib(i)+"");
        }
    }

}
