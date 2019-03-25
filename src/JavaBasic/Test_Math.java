package JavaBasic;

public class Test_Math {
    public static void main(String[] args){
        float m = 6.4F;
        float n = -6.4f;
        System.out.println("Math.round(" + m + ") =" + Math.round(m)); // round 四舍五入
        System.out.println("Math.round(" + n + ") =" + Math.round(n));
        System.out.println("Math.round(" + m + ") =" + Math.ceil(m));
        System.out.println("Math.round(" + n + ") =" + Math.ceil(n));
        System.out.println("Math.round(" + m + ") =" + Math.floor(m));
        System.out.println("Math.round(" + n + ") =" + Math.floor(n));
    }
}
