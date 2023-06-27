package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TotalNumberOfElement {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90));
        Long longs=list.stream().count();
        System.out.println(longs);
        }
}
