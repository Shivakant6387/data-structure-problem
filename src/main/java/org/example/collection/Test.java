//Write a program to traverse (or iterate) ArrayList?
package org.example.collection;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("Using advanced for loop");
        for (Integer num:al){
            System.out.println(num);
        }
    }
}
