public class Test_RightShift {
    public static void main(String[] args){
        int i =-4;
        System.out.println(" -----int >> :"+ i);
        System.out.println("移位前二进制：" + Integer.toBinaryString(i));
        i >>= 1;
        System.out.println("移位后二进制：" + Integer.toBinaryString(i));
        System.out.println(" -----int >> :" + i);
        i = -4;
        System.out.println(" -----int >>> :"+ i);
        System.out.println("移位前二进制：" + Integer.toBinaryString(i));
        i >>>= 1;
        System.out.println("移位后二进制：" + Integer.toBinaryString(i));
        System.out.println(" -----int >> :" + i);
        short j =-4;
        System.out.println(" -----short>>>:" + j);
        System.out.println("移位前二进制：" + Integer.toBinaryString(j));
        j >>>=1;
        System.out.println("移位后二进制：" + Integer.toBinaryString(j));
        System.out.println(" -----short >>>:" + j);
        i = 5;
        System.out.println(" -----int>>:" + i);
        System.out.println("移位前二进制：" + Integer.toBinaryString(i));
        i>>>=32;
        System.out.println("移位后二进制：" + Integer.toBinaryString(i));
        System.out.println(" -----int>>:" + i);
    }
}
