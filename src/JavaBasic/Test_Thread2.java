package JavaBasic;

//Runnable接口实现多线程
class MyThread2 implements Runnable{ // 创建线程类
    public void run(){
        System.out.println("Thread body");
    }
}
public class Test_Thread2 {
    public static void main(String[] args){
        MyThread thread = new MyThread();
        Thread t = new Thread(thread);
        t.start(); // 开启线程
    }
}
