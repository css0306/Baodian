package JavaBasic;

import java.net.*;
import java.io.*;

// 网络上两个程序通过一个双向的通信连接实现数据的交换，这个双向链路的一端称为一个Socket。
class Client {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            Socket socket = new Socket("localhost", 2000);
            // 获取输入流与输出流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
            // 向服务器发送数据
            pw.println("Hello");
            String s = null;
            while (true) {
                s = br.readLine();
                if (s != null)
                    break;
            }
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
            } catch (Exception e) {
            }
        }
    }
}
