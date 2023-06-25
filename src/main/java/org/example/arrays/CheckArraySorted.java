package org.example.arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int n=arr.length;
        System.out.println(isSorted(arr,n));
    }
    static boolean isSorted(int arr[],int n){
        for (int i=0;i<n;i++)
            for (int j=i+1;j<n;j++)
                if (arr[j]<arr[i])
                    return false;
        return true;
    }
}
