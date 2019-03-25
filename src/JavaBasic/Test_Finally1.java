package JavaBasic;

public class Test_Finally1 {
    public static int testFinally_1(){
        try{
            return 1;
        }catch (Exception e){
            return 0;
        }finally {
            System.out.println("execute finally");
        }
    }

    public static int testFinally_2(){
        try{
            return 1;
        }catch (Exception e){
            return 0;
        }finally {
            System.out.println("execute finally");
            return 3;
        }
    }

    public static void main(String[] args){
        int result1 = testFinally_1();
        int result2 = testFinally_2();
//        System.out.println(result1);
        System.out.println(result2);
    }
}
