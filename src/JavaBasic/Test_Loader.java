package JavaBasic;

public class Test_Loader { //通过委托的方式协调类的加载
    public static void main(String[] args){
        //调用class加载器
        ClassLoader clApp = Test_Loader.class.getClassLoader();
        System.out.println(clApp);
        //调用上一层class加载器
        ClassLoader clExt = clApp.getParent();
        System.out.println(clExt);
        //调用根部class加载器
        ClassLoader clBoost = clExt.getParent();
        System.out.println(clBoost);
    }
}
