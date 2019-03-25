package JavaBasic;

public class Test_Static_Attribute {
    public static int staticInt = 0;
    public int nonStaticInt = 0;
    public static void main(String[] args){
        Test_Static_Attribute t = new Test_Static_Attribute();
        System.out.println("t.staticInt = "+ t.staticInt);
        System.out.println("TestAtrribute.staticInt = "+ Test_Static_Attribute.staticInt);
        System.out.println("t.nonStatic = " + t.nonStaticInt);
        System.out.println("对静态变量和实例变量分别 + 1");
        t.staticInt ++;
        t.nonStaticInt ++;
        Test_Static_Attribute t1 = new Test_Static_Attribute();
        System.out.println("t1.staticInt = "+ t1.staticInt);
        System.out.println("TestAttribute.staticInt = "+Test_Static_Attribute.staticInt);
        System.out.println("t1.nonStaticInt = "+t1.nonStaticInt);
    }
}
