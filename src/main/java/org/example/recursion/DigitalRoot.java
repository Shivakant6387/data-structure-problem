package org.example.recursion;

public class DigitalRoot {
    public static void main(String[] args) {
        String str = "675987890789756545689070986776987";

        // Function call
        System.out.print(GetDigitalRoot(str));
    }
    // Function to convert given
    // sum into String
    static String convertToString(int sum)
    {
        String str = "";

        // Loop to extract digit one by one
        // from the given sum and concatenate
        // into the String
        while (sum > 0) {

            // Type casting for concatenation
            str = str + (char)((sum % 10) + '0');
            sum = sum / 10;
        }

        // Return converted String
        return str;
    }

    // Function to get individual digit
    // sum from String
    static String GetIndividulaDigitSum(String str, int len)
    {
        int sum = 0;

        // Loop to get individual digit sum
        for (int i = 0; i < len; i++) {
            sum = sum + str.charAt(i) - '0';
        }

        // Function call to convert
        // sum into String
        return convertToString(sum);
    }

    // Function to calculate the digital
    // root of a very large number
    static int GetDigitalRoot(String str)
    {
        // Base condition
        if (str.length() == 1) {
            return str.charAt(0) - '0';
        }

        // Function call to get
        // individual digit sum
        str = GetIndividulaDigitSum(str, str.length());

        // Recursive function to get digital
        // root of a very large number
        return GetDigitalRoot(str);
    }

}
