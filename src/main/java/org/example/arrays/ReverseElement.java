package org.example.arrays;

public class ReverseElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int n=arr.length;
        reverse(arr,n);
    }
  static   void reverse(int arr[],int n){
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]+",");

        }
    }
}
