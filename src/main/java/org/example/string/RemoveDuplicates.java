package org.example.string;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="Amritaa";
        System.out.println(removeDuplicate(str));
    }

    private static String removeDuplicate(String str) {
        int n=str.length();
        int res_ind=1,ip_ind=1;
        char[]arr=str.toCharArray();
        while (ip_ind!=n) {
            if (arr[ip_ind] != arr[ip_ind - 1]) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
            str=new String(arr);
        return str.substring(0,res_ind);
    }
}
