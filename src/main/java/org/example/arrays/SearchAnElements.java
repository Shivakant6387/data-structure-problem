package org.example.arrays;

public class SearchAnElements {
    static int searchAnElement(int nums[],int l,int h,int key){
        if (l>h)
            return -1;
        int mid=(l+h)/2;
        if (nums[mid]==key)
            return mid;
        if (nums[l]<=nums[mid]){
            if (key>=nums[l] && key<=nums[mid])
                return searchAnElement(nums,l,mid-1,key);
            return searchAnElement(nums,mid+1,h,key);
        }
        if (key>=nums[mid] && key<=nums[h])
            return searchAnElement(nums,mid+1,h,key);
        return searchAnElement(nums,l,mid-1,key);
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        int key = 5;
        int i = searchAnElement(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");

    }
}
