package JavaBasic;

public class Test_Join { //join()的作用是让调用该方法的线程在执行完run()方法后，再执行join()方法后面的代码
    public static void main(String[] args){
        Thread t = new Thread(new ThreadImp());
        t.start();
        try{
            t.join(1000); // 主线程等待t结束，只等1秒
            if(t.isAlive()) //t已经结束
                System.out.println("t has not finished");
            else
                System.out.println("t has finished");
            System.out.println("joinFinish");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ThreadImp implements Runnable{
    public void run(){
        try{
            System.out.println("Begin ThreadImp");
            Thread.sleep(5000);
            System.out.println("End ThreadImp");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
