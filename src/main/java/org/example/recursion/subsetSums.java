package org.example.recursion;

public class subsetSums {
    static boolean isThereSubsetSum(int arr[],int n,int sum){
        if (sum==0)
            return true;
        if (n==0)
            return false;
        if (arr[n-1]>sum)
            return isThereSubsetSum(arr,n-1,sum);
        return isThereSubsetSum(arr,n-1,sum)||isThereSubsetSum(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args) {
        int []arr={1,2,3};
        int n=arr.length;
        int sum=0;
        System.out.println(isThereSubsetSum(arr,n,sum));

    }
}
