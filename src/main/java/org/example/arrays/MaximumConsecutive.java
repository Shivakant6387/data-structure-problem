package org.example.arrays;

public class MaximumConsecutive {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,1,0,1,1};
        int n=arr.length;
        System.out.println(getMax(arr,n));
    }
    static int getMax(int arr[],int n){
    int ans=0;
    int count=0;
    for (int i=0;i<n;i++){
        for (int j=i;j<n;j++){
            if (arr[j]==1)
                count++;
            else
                break;
        }
        ans=Math.max(count,ans);
    }
    return ans;
    }
}
