package JavaBasic;

// 当一个字符串需要频繁修改时，使用StringBuffer要比String效率高很多。
public class Test_StringBuffer {
    public static void testString(){
        String s = "Hello";
        String s1 = "world";
        long start = System.currentTimeMillis();
        for(int i = 0; i< 10000; i++){ // 两种方法都修改一万次
            s += s1;
        }
        long end = System.currentTimeMillis();
        long runTime = (end - start);
        System.out.println("testString:" + runTime);
    }
    public static void testStringBuffer(){
        StringBuffer s = new StringBuffer("Hello");
        String s1 = "world";
        long start = System.currentTimeMillis();
        for(int i =0; i<10000; i++){
            s.append(s1);
        }
        long end = System.currentTimeMillis();
        long runTime = (end - start);
        System.out.println("testStringBuffer: "+ runTime);
    }
    public static void main(String[] args){
        testString();
        testStringBuffer();
    }
}
