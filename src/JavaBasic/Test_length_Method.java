package JavaBasic;

public class Test_length_Method {
    public static void testArray(int[] arr){
        System.out.println("数组长度为:"+ arr.length);
    }
    public static void testString(String s){
        System.out.println("字符串长度为:" + s.length());
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,7};
        String s = "1357";
        testArray(arr);
        testString(s);
    }
}
