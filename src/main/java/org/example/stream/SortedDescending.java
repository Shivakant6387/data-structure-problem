package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDescending {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10,15,8,49,25,98,98,32,15));
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
