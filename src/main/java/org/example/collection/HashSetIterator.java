package org.example.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Pear");
        hashSet.add("Papaya");
        Iterator<String>it=hashSet.iterator();
        System.out.println("Hashset contains :");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
