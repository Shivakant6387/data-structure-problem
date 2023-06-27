package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMaximum {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10,15,8,49,25,98,98,32,15));
        int max=list.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
