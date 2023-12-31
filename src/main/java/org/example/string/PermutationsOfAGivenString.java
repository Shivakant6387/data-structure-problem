package org.example.string;

public class PermutationsOfAGivenString {
    public static void main(String[] args) {
        String str="ABC";
        int n=str.length();
        PermutationsOfAGivenString permutations=new PermutationsOfAGivenString();
        permutations.permute(str,0,n-1);
    }

    private void permute(String str, int l, int r) {
        if (l==r)
            System.out.println(str);
        else {
            for (int i=l;i<=r;i++){
                str=swap(str,l,i);
                permute(str,l+1,r);
                str=swap(str,l,i);
            }
        }

    }

    private String swap(String str, int j, int i) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
