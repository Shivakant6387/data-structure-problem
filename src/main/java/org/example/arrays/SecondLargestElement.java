package org.example.arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={10,5,20,8};
        int n=arr.length;
        System.out.println(secondLargestElement(arr,n));
    }
    static int secondLargestElement(int arr[],int n){
        int secondLargestElement=0;
        Arrays.sort(arr);
        for (int i=0;i<n-1;i++){
            secondLargestElement=arr[i];
        }
        return secondLargestElement;
    }
}
