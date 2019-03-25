// 通过方法覆盖(override)实现的多态又叫运行时多态
class Base{
    public Base(){ // 父类的构造器，构造器中调用了父类的g()方法
        g();
    }
    public void f(){ // 父类的f()方法
        System.out.println("Base f()");
    }
    public void g(){ // 父类的g()方法
        System.out.println("Base g()");
    }
}
class Derived extends Base{
    public void f(){ // 子类的f()方法，覆写了父类的f()方法
        System.out.println("Derived f()");
    }
    public void g(){ // 子类的g()方法，覆写了父类的g()方法
        System.out.println("Derived g()");
    }
}
public class Test_Runtime_Polymorphism {
    public static void main(String[] args){
        Base b = new Derived(); //父类的引用，子类的实例
        b.f();
        b.g();
    }
}
