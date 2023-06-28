package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int nums[])
    {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        if(set.size() == list.size()) {
            return false;
        }
        return true;
    }
}
