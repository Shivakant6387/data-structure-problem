package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStarted1 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10,15,28,95,38,17));
        list.stream().map(s->s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}
