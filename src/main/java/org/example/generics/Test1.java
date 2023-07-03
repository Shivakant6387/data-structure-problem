package org.example.generics;
class Tested<T,U>{
    T obj1;
    U obj2;
    Tested(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class Test1 {
    public static void main(String[] args) {
    Tested<String ,Integer>obj=new Tested<>("Test",20);
        obj.print();
    }
}
