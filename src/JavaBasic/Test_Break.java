package JavaBasic;

public class Test_Break {
    public static void main(String[] args){
        out: // 设置标签，以便break跳出多重循环。
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(j >=2)
                    break out;
                System.out.println(j);
            }
        }
        System.out.println("break");
    }
}
