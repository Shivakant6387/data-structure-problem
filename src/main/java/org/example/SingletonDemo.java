package org.example;
class singleton{
    private static singleton singleton_instace=null;
    public String s;
    public singleton(){
        s="Hello I am a string part of singleton class";
    }
    public static synchronized singleton getInstance(){
        if (singleton_instace==null)
            singleton_instace=new singleton();
        return singleton_instace;
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        singleton x=singleton.getInstance();
        singleton y=singleton.getInstance();
        singleton z=singleton.getInstance();
        System.out.println("Hashcode of x is "+x.hashCode());
        System.out.println("Hashcode of y is"+y.hashCode());
        System.out.println("Hashcode of z is"+z.hashCode());
        if (x==y && y==z){
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");

        }
        else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");

        }

    }
}
