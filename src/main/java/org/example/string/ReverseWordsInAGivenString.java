package org.example.string;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String str="i like this program very much";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String s="";
        char ch;
        for (int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            s+=ch;
        }
        return s;
    }
}
