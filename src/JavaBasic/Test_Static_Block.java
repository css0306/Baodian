package JavaBasic;

public class Test_Static_Block {
    private static int a;
    static { // 静态代码块,只会被执行一次
        Test_Static_Block.a = 4; // 初始化静态变量
        System.out.println(a);
        System.out.println("static block is called");
    }
    public static void main(String[] args){
    }
}
