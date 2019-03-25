package JavaBasic;

import java.util.StringTokenizer;
public class Test_StringTokenizer {
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("Deep Dark Fantasy");
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken()+"♂");
        }
    }
}
