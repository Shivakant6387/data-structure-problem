package org.example.arrays;

public class MaximumCircularSumSubarray {
    public static void main(String[] args) {
        int nums[]={5,-2,3,4};
        int n=nums.length;
        System.out.println(maximumCircularSumSubarray(nums,n));
    }
    static int maximumCircularSumSubarray(int nums[],int n){
        if (n==1)
            return nums[0];
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=nums[i];
        }
        int count_max=nums[0],max_so_far=nums[0],count_min=nums[0],min_so_far=nums[0];
        for (int i=1;i<n;i++){
            count_max=Math.max(count_max+nums[i],nums[i]);
            max_so_far=Math.max(max_so_far,count_max);
            count_min=Math.min(count_min+nums[i],nums[i]);
            min_so_far=Math.min(min_so_far,count_min);
        }
        if (min_so_far==sum){
            return max_so_far;
        }
        return Math.max(max_so_far,sum-min_so_far);
    }
}
