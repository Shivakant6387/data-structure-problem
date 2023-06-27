package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheLastElement {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
       List<Integer>integerList= Collections.singletonList(list.stream().reduce((first, second) -> second).orElse(-1));
        System.out.println(integerList);
    }
}
