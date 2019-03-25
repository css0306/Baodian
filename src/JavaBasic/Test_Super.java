class BaseClass{
    public void f(){
        System.out.println("BaseClass:f()");
    }
}
class SubClass extends BaseClass{
    public void f(){
        System.out.println("SubClass:f()");
    }
    public void subf(){
        f();
    }
    public void basef(){
        super.f();
    }
}
public class Test_Super {
    public static void main(String[] args){
        SubClass s = new SubClass();
        s.subf();
        s.basef();
        s.f();
        BaseClass b = new SubClass();
        b.f();
        BaseClass b1 = new BaseClass();
        b1.f();
    }
}
