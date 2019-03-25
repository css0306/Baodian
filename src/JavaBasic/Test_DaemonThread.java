package JavaBasic;

class DaemonThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+ ":begin");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":end"); //不会输出Thread-0:end，因为启动线程前将其设置为了守护线程，
        // 当程序中只剩守护线程时，JVM自动关闭。
    }
}
public class Test_DaemonThread {
    public static void main(String[]args){
        System.out.println("test3:begin");
        Thread t1 = new DaemonThread();
        t1.setDaemon(true); // t1设为守护进程
        t1.start();
        System.out.println("test3:end");
    }
}
