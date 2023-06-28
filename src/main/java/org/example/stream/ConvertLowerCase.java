package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertLowerCase {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("SHIVA"));
        List<String> nameLst = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(nameLst);
    }
}
