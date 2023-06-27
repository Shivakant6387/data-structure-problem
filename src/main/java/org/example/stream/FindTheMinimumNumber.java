package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMinimumNumber {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10,15,8,49,25,98,98,32,15));
        int min=list.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}
