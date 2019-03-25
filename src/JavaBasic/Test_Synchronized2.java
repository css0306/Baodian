package JavaBasic;

//当一个线程进入一个对象的synchronized()方法后，其他线程依然可以访问同一对象的
// 非synchronized()方法和static的synchronized()方法

class Test {
    public synchronized void synchronizedMethod(){ // Test类中的synchronized方法
        System.out.println("begin calling synchronizedMethod");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("finish calling synchronizedMethod");
    }
//    public void generalMethod(){ // Test类中的非synchronized方法
//        System.out.println("call generalMethod...");
//    }
    public static synchronized void generalMethod(){
        System.out.println("call generalMethod...");
    }
}
class MultiThread{
    static final Test t = new Test(); // 实例化Test对象
    public static void main(String[] args){
        Thread t1 = new Thread(){ //创建线程t1
            public void run(){
                t.synchronizedMethod();
            }
        };
        Thread t2 = new Thread(){ //创建线程t2
            public void run(){
                t.generalMethod();
            }
        };
        t1.start();
        t2.start();
    }
}
