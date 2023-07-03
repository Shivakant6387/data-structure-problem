//Write a program to convert List to Array.
package org.example.collection;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");
        arrayList.add("Pear");

        System.out.println(arrayList);
        String[]str=new String[arrayList.size()];
        for (int i=0;i<arrayList.size();i++){
            str[i]=arrayList.get(i);
        }
        for (String s:str){
            System.out.println(s);
        }
    }
}
