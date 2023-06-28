package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        int[]list={ 12,19,20,88,00,9};
        int num=Arrays.stream(list).max().getAsInt();
        System.out.println(num);
    }
}
