public class Test_Pass2 {
    public static void changeStringBuffer(StringBuffer ss1, StringBuffer ss2){
        ss1.append(" World" );
        ss2 = ss1; // 按引用传递
    }
    public static void main(String[] args){
        Integer a = 1; // Integer是int的包装类，包装类是不可变量，因此没有提供改变它的方法
        Integer b = a; // 包装类也是按引用传递而非按值传递
        b++; // 执行完这一步后，此时会创建一个新值为2的Integer赋值给b，b与a已经没有任何关系了
        System.out.println(a); // 1
        System.out.println(b); // 2
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer("Hello");
        changeStringBuffer(s1,s2); // 执行ss2=ss1时，只会ss2的值，而对s2毫无影响
        System.out.println(s1); // Hello World
        System.out.println(s2); // Hello
    }
}
