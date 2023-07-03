package org.example.multithread;
class  MultithreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("This is demo thread  started here");
    }
}
public class TestThread {
    public static void main(String[] args) {
        MultithreadDemo demo=new MultithreadDemo();
        demo.start();
    }
}
