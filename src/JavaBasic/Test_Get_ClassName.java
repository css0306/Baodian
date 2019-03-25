package JavaBasic;

class A{}
public class Test_Get_ClassName extends A {
    public void test(){
        System.out.println(this.getClass().getName()); // 获得运行时类的类名
        System.out.println(this.getClass().getSuperclass().getName()); // 利用反射机制在子类中获得父类名字
    }
    public static void main(String[] args){
        new Test_Get_ClassName().test();
    }
}
