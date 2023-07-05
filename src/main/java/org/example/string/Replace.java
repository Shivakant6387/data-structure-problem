package org.example.string;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Replace {
    public static void main(String[] args) {
        String str="Hello";
       String h= str.replace("Hello","H");
        System.out.println(h);
        String str2="Swiss";
        String w=str2.replace("Swiss","w");
        System.out.println(w);
    }
}
