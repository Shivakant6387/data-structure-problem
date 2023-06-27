package org.example.arrays;

public class FindTheSmallestMissingNumber {
    static int findTheSmallestMissingNumber(int arr[],int start,int end){
        if (start>end)
            return end+1;
        if (start!=arr[start])
            return start;
            int mid=(start+end)/2;
            if (arr[mid]==mid)
                return findTheSmallestMissingNumber(arr,mid+1,end);

        return findTheSmallestMissingNumber(arr,start,mid);
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6,8, 10};
        int n = arr.length;
        System.out.println("First Missing element is : "+findTheSmallestMissingNumber(arr,0,n-1));
    }
}
