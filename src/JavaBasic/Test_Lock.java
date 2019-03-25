package JavaBasic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test_Lock {
    public static void main(String[] args) throws InterruptedException{
        final Lock lock = new ReentrantLock();
        lock.lock();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try{
                    lock.lockInterruptibly();
                    // lock.lock(); 编译器报错
                }catch (InterruptedException e){
                    System.out.println(" interrupted.");
                }
            }
        });
        t1.start();
        t1.interrupt();
        Thread.sleep(1);
    }
}
