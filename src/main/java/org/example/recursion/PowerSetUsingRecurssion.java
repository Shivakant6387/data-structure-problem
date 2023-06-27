package org.example.recursion;

public class PowerSetUsingRecurssion {
    public static void main(String[] args) {
        String str = "abc";
        int index = -1;
        String curr = "";
        powerSetUsingRecurssion(str, index, curr);
    }
    static void powerSetUsingRecurssion(String str,int index,String curr){
        int n=str.length();
        if(index==n)
            return;
        System.out.println(curr);
        for (int  i=index+1;i<n;i++){
            curr+=str.charAt(i);
            powerSetUsingRecurssion(str,i,curr);
            curr=curr.substring(0,curr.length()-1);
        }
    }
}
