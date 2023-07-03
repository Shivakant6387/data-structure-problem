// Write a program to convert Array to List?
package org.example.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] cities={"Boston", "Dallas", "New York", "Chicago"};

        ArrayList<String>list=new ArrayList<>(Arrays.asList(cities));
        list.add("San Francisco");
        list.add("San jose");
for (String s:list){
    System.out.println(s);
}
    }
}
