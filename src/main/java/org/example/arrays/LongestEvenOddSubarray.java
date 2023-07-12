package org.example.arrays;

public class LongestEvenOddSubarray {
    public static void main(String[] args) {
        int arr[]={-3,8,-2,4,-5,6};
        int n=arr.length;
        System.out.println(longestEvenOdd(arr,n));
    }
    static int longestEvenOdd(int arr[],int n){
        int ans=1;
        int count=1;
        for (int i=0;i<n-1;i++){
            if ((arr[i]+arr[i+1])%2==1){
                count++;
            }
            else {
                ans=Math.max(ans,count);
                count=1;
            }
        }
        ans=Math.max(ans,count);
        if (ans==1)
            return 0;
        return ans;
    }
}
