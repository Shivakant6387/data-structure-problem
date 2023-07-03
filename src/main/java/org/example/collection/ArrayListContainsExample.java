package org.example.collection;

import java.util.ArrayList;

public class ArrayListContainsExample {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(3);
        arrayList.add(17);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(7);
        if (arrayList.contains(7)){
            System.out.println("7 was found in the list");
        }
        else {
            System.out.println("7 was not found in the list");
        }
    }
}
