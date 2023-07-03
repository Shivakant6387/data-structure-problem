package org.example.multithread;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("This thread is running ");
    }

    public static void main(String[] args) {
        RunnableDemo demo=new RunnableDemo();
        Thread obj =new Thread(demo);
        obj.start();
    }
}
