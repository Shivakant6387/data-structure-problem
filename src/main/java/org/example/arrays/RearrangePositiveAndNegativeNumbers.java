package org.example.arrays;

public class RearrangePositiveAndNegativeNumbers {
    static  void rearrange(int nums[],int n){
        int i=-1;
        int temp=0;
        for (int j=0;j<n;j++){
            if (nums[j]<0){
                i++;
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int pos=i+1; int  neg=0;
        while (pos<n && neg<pos && nums[neg]<0){
            temp=nums[neg];
            nums[neg]=nums[pos];
            nums[pos]=temp;
            pos++;
            neg+=2;
        }
    }
    static void printArray(int nums[],int n){
        for (int i=0;i<n;i++)
            System.out.print(nums[i]+" ");
    }
    public static void main(String[] args) {
        int nums[]={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n=nums.length;
        rearrange(nums,n);
        System.out.println("Array after rearranging:");
        printArray(nums,n);
    }
}
