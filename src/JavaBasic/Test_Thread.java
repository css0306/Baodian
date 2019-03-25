package JavaBasic;

// 通过继承Thread类实现多线程
class MyThread extends Thread{ //创建线程类
    public void run(){
        System.out.println("Thread body"); // 线程的函数体
    }
}
public class Test_Thread{
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start(); // 开启线程，但并非立即执行多线程代码，何时执行是由操作系统决定的
    }
}
