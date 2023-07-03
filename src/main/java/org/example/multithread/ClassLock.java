package org.example.multithread;
class ClassLockDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        synchronized (ClassLockDemo.class){
            System.out.println("in lock" +Thread.currentThread().getName());
            System.out.println("in lock"+Thread.currentThread().getName()+"end");
        }
    }
}
public class ClassLock {
    public static void main(String[] args) {
    ClassLockDemo demo=new ClassLockDemo();
    Thread thread1=new Thread(demo);
    Thread thread2=new Thread(demo);
    ClassLockDemo demo1=new ClassLockDemo();
    Thread thread3=new Thread(demo1);
    thread1.start();
    thread2.start();
    thread3.start();

    }
}
