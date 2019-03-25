// 值传递和引用传递
package JavaBasic;

public class Test_Pass {
    public static void testPassParameter(StringBuffer ss1, int n){
        ss1.append(" World"); // 引用
        n = 8; // 值
    }
    public static void main(String[] args){
        int i = 1;
        StringBuffer s1 = new StringBuffer("Hello");
        // 在调用方法时，i为基本类型，因此参数按值传递，此时会创建一个i的副本，
        // 与i有着相同的值，把这个副本作为参数赋值给n作为传递的参数。
        testPassParameter(s1, i); // 形参ss1与实参s1指向的是同一块存储空间
        System.out.println(s1);
        System.out.println(i); // 在方法内部修改的是n的值，这个值与i没有关系。
    }
}
