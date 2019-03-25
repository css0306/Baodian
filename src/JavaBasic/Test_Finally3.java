package JavaBasic;

// finally块并不是一定会被执行，比如进入try块之前就抛出异常的情况，这样finally块也就不会被执行了。
public class Test_Finally3 {
    public static void testFinally1(){
        int i = 5/0; // 这里5/0已经出现异常
        try{
            System.out.println("try block");
        }catch (Exception e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }
    }
// 再比如在try块中强制退出的情况，也不会执行finally块中的代码
    public static void testFinally2(){
        try{
            System.out.println("try block");
            System.exit(0);
        }catch (Exception e){
            System.out.println("catch block");
        }
    }
    public static void main(String[] args){
//        testFinally1();
        testFinally2();
    }
}
