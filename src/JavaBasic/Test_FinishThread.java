package JavaBasic;

public class Test_FinishThread {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("thread go to sleep");
                try{
                    // 用休眠模式来模拟线程被阻塞
                    Thread.sleep(5000);
                    System.out.println("thread finish");
                }catch (InterruptedException e){
                    System.out.println("thread is interrupted");
                }
            }
        });
        thread.start();
        thread.interrupt();
    }
}
