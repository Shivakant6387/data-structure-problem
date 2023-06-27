package org.example.stream;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10,20,12,20,59,89,90,45,43,45));
        Set<Integer>set=new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);
    }
}
