package org.example.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};
        int n=arr.length;
        System.out.println(maxSubarraySum(arr,n));
    }
    static int maxSubarraySum(int arr[],int n){
        int max_so_far = Integer.MIN_VALUE, max_ending_here
                = 0;

        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
         }
        }