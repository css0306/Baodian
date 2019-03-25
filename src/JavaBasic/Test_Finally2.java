package JavaBasic;

public class Test_Finally2 {
    public static int testFinally_1(){
        int result = 1;
        try{
            result = 2;
            return result;
        }catch(Exception e){
            return 0;
        }finally {
            result = 3; // 在finally中改变return的值，对返回值没有任何影响，而对引用类型的数据会有影响。
            System.out.println("execute finally1");
        }
    }
    public static StringBuffer testFinally_2(){
        StringBuffer s = new StringBuffer("Hello");
        try {
            return s;
        }catch (Exception e){
            return null;
        }finally {
            s.append(" World");
            System.out.println("execute finally2");
        }
    }
    public static void main(String[] args){
        int resultVal = testFinally_1();
        System.out.println(resultVal);
        StringBuffer resultRef = testFinally_2();
        System.out.println(resultRef);
    }
}