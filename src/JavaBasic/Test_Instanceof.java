package JavaBasic;

public class Test_Instanceof {
    public static void main(String args[]){
        String s = "Hello";
        int[] a = {1,2};
        if(s instanceof String)
            System.out.println("True");
        else{
            System.out.println("False");
        }
        if(a instanceof Object)
            System.out.println("true");
        if(a instanceof int[])
            System.out.println("true");
    }
}
