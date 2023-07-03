package org.example.string;

public class Test {
    public static void main(String[] args) {
        String str="asdfghjklzxcvbnmqwertyuiop";
        System.out.println(str.length());
        int i=0;
        for (char ch:str.toCharArray()){
        i++;
        }
        System.out.println(i);
    }
}
