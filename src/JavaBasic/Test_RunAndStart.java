package JavaBasic;

// 只有通过调用线程类的start()方法才能真正达到多线程的目的
class ThreadDemo extends Thread{
    @Override
    public void run(){
        System.out.println("ThreadDemo:begin");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("ThreadDemo:end");
    }
}

public class Test_RunAndStart {
    public static void test1(){
        System.out.println("test1: begin");
        Thread t1 = new ThreadDemo();
        t1.start();
        System.out.println("test1: end");
    }
    public static void test2(){
        System.out.println("test2: begin");
        Thread t1 = new ThreadDemo();
        t1.run();
        System.out.println("test2: end");
    }
    public static void main(String[] args){
        test1();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
        test2();
    }
}
