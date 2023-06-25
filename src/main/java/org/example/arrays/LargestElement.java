package org.example.arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={10,5,20,8};
        int n=arr.length;
        LargestElement.largestElement(arr,n);
        System.out.println(getLargestElement(arr,n));
    }
    static  int getLargestElement(int arr[],int n){
        for (int i=0;i<n;i++){
            boolean flag=true;
            for (int j=0;j<n;j++){
                if (arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if (flag==true)
                return i;
        }
        return -1;
    }
    public static void largestElement(int arr[],int n){
        Arrays.sort(arr);
        int hight=0;
        for (int i=0;i<n;i++){
           hight= arr[i];
        }
        System.out.println(hight);
    }
}
