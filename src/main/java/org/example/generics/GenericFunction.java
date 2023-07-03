package org.example.generics;
class Demo{
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+"="+element);
    }
}
public class GenericFunction {
    public static void main(String[] args) {
        Demo.genericDisplay(11);
        Demo.genericDisplay("Testing");
        Demo.genericDisplay(1.0);
    }
}
