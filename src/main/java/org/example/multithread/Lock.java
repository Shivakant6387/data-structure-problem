package org.example.multithread;

public class Lock implements Runnable{
    public static void main(String[] args) {
        Lock lock=new Lock();
        Thread thread1=new Thread(lock);
        Thread thread2=new Thread(lock);
        Lock lock1=new Lock();
        Thread thread3=new Thread(lock1);
        thread1.setName("thread 1");
        thread2.setName("thread 2");
        thread3.setName("thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        synchronized (this){
            System.out.println("in block "+Thread.currentThread().getName());
            System.out.println("in block"+Thread.currentThread().getName()+"end");
        }
    }
}
