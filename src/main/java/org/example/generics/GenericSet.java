package org.example.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericSet {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<>();
        set1.add(100);
        set1.add(Integer.valueOf(101));
        Set<String>set2=new HashSet<>();
        set2.add("Test");
        set2.add("Generic");
        for (Integer data : set1) {
            System.out.printf("Integer Value :%d\n", data);
        }

        // Iterate set2 using iterator
        Iterator<String> stringIt = set2.iterator();

        while (stringIt.hasNext()) {
            System.out.printf("String Value :%s\n",
                    stringIt.next());
        }
    }
}
