class Man {
    private String name;
    private int age;

    public Man() {
        this.age = 24;
        this.name = "Van";
    }

    public String toString() {
        return "name:" + this.name + " age:" + this.age;
    }
}

public class Test_Print {
    public static void main(String[] args) {
        System.out.println(new Man()); //传入的是对象，因此调用toString方法打印出返回的字符串
                                        //若没有toString方法则打印对象名和地址
        System.out.println(1 + 2 + ""); //传入参数中的+从左到右计算，先算1+2，所以算作整型，得到3后转为字符串，再与""相加
        System.out.println("" + 1 + 2); // 先传入字符串""，后面的1和2也算做字符串，所以得到12
    }
}
