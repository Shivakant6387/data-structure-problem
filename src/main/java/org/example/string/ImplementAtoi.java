package org.example.string;

public class ImplementAtoi {
    public static void main(String[] args) {
        int val;
        String str="123456";
        val=Integer.parseInt(str);
        System.out.println("String value"+str);
        System.out.println("Integer value"+val);
        String str2="GeeksForGeeks";
        try {
            val=Integer.parseInt(str2);
            System.out.println("String value"+str2);
            System.out.println("Integer value "+val);
        }catch (NumberFormatException e){
            val=0;
            System.out.println("String value"+str2);
            System.out.println("Integer value"+val);
        }
    }
}
