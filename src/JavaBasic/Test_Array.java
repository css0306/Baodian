package JavaBasic;

public class Test_Array {
    public static void main(String[] args){
        int [] a = {1,2};
        int [][] b = new int[2][4];
        String[] s = {"a", "b"};
        if(a instanceof int[])
            System.out.println("the type for a is int[]");
        if(b instanceof int[][])
            System.out.println("the type for b is int[][]");
        if(s instanceof String[])
            System.out.println("the type for a is String[]");
    }
}
