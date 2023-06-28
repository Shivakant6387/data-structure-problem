package org.example.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCase {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>(Arrays.asList("shiva"));
        List<String> nameLst = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(nameLst);
    }
}
