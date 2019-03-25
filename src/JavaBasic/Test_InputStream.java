import java.io.*;

class MyOwnInputStream extends FilterInputStream{
    public MyOwnInputStream(InputStream in){
        super(in);
    }
    public int read() throws IOException{
        int c = 0;
        if((c=super.read())!= -1){
            // 小写转大写
            if(Character.isLowerCase((char)c))
                return Character.toUpperCase((char)c);
            // 大写转小写
            else if(Character.isUpperCase((char)c))
                return Character.toLowerCase((char)c);
            // 如果不是字母，保持不变
            else
                return c;
        }
        else {
            return -1;
        }
    }
}
public class Test_InputStream {
    public static void main(String[] args){
        int c;
        try{
            InputStream is = new MyOwnInputStream(new BufferedInputStream(new FileInputStream("E:\\Baodian\\src\\test.txt")));
            while ((c = is.read())>=0){
                System.out.print((char)c);
            }
            is.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
