package org.example.arrays;

public class CountRotations {
    public static void main(String[] args) {
        int arr[] = { 15, 18, 2, 3, 6, 12 };
        int n = arr.length;

        System.out.println(countRotations(arr, n));
    }
    static int countRotations(int nums[],int n){
        int min=nums[0],min_index=0;
        for (int i=0;i<n;i++){
            if (min>nums[i])
                min=nums[i];
            min_index=i;
        }
        return min_index;
    }
}
