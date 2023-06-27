package org.example.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class KthPositiveAndNegativeNumber {
    static int kthLargestSum(int nums[],int n,int k){
        ArrayList<Integer>result=new ArrayList<>();
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++){
                sum+=nums[j];
                result.add(sum);
            }
        }
        // Sort in decreasing order
        Collections.sort(result,
                Collections.reverseOrder());

        // return the Kth largest sum
        return result.get(k - 1);
    }
    public static void main(String[] args) {
        int a[] = { 20, -5, -1 ,-7,9};
        int N = a.length;
        int K = 3;

        // Function call
        System.out.println(kthLargestSum(a, N, K));
    }
}
