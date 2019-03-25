package JavaBasic;

import java.util.concurrent.*;

//通过实现Callable接口和重写call()方法来实现多线程
public class Test_Thread3 {
    // 创建线程类
    public static class CallableTest implements Callable<String>{
        public String call() throws Exception{
            return "Hello World";
        }
    }
    public static void main(String[] args){
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        // 启动线程
        Future<String> future = threadPool.submit(new CallableTest());
        try{
            System.out.println("waiting thread to finish");
            System.out.println(future.get()); //等待线程结束，并获取返回结果
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
