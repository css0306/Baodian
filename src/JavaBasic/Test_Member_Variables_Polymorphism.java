package JavaBasic;

// 只有类中的方法才有多态概念，类中成员变量没有多态的概念。
class Base1{
    public int i = 1; // 成员变量的取值不取决于创建对象的类型，而取决于定义变量的类型，这里定义在父类中，所以取值是1。
}
class Derived1 extends Base1{
    public int i = 2;
}
public class Test_Member_Variables_Polymorphism {
    public static void main(String[] args){
        Base1 b = new Derived1(); // b所属的类型是Base，b.i指父类中定义的i。
        System.out.println(b.i);
    }
}
