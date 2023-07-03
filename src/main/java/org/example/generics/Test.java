package org.example.generics;
class Tests<T>{
    T obj;
    Tests(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return this.obj;
    }
}
public class Test {
    public static void main(String[] args) {
        Tests<Integer>test=new Tests<>(15);
        System.out.println(test.getObj());
        Tests<String>sObj=new Tests<>("Sakshi");
        System.out.println(sObj.getObj());
    }
}
