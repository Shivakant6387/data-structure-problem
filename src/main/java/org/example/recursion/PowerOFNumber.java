package org.example.recursion;

public class PowerOFNumber {
    public static void main(String[] args) {
        int num=4;
        int p=2;
        System.out.println(power(num,p));
    }
    static int power(int n,int p){
        if (p==0)
            return 1;
        else
            return n*power(n,p-1);
    }
}
