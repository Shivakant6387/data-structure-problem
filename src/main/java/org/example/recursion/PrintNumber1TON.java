package org.example.recursion;

public class PrintNumber1TON {
    public static void main(String[] args) {
        printNumber(10);
    }
    static void printNumber(int num) {
        if (num <= 0)
            return ;
        else
            printNumber(num-1);
        System.out.println(" "+num);
    }
}
