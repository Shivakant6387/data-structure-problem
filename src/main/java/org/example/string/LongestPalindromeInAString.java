package org.example.string;

public class LongestPalindromeInAString {
    public static void main(String[] args) {
        String str="forgeeksskeegfor";
        System.out.println(longestPalSubstr(str));
    }

    private static int longestPalSubstr(String str) {
        int n=str.length();
        int maxLength=1,start=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k)
                            != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        System.out.print(
                "Longest palindrome substring is: ");
        printSubStr(str, start, start + maxLength - 1);

        // Return length of LPS
        return maxLength;
    }

    private static void printSubStr(String str, int low, int high) {
        for (int i = low; i <= high; ++i)
            System.out.print(str.charAt(i));
    }
}
