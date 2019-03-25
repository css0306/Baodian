package JavaBasic;

import java.net.*;
import java.io.*;
// 网络上两个程序通过一个双向的通信连接实现数据的交换，这个双向链路的一端就是一个Socket
class Server { // Server就是一个Socket
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            ServerSocket server = new ServerSocket(2000);
            Socket socket = server.accept();
            // 获取输入流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 获取输出流
            pw = new PrintWriter(socket.getOutputStream(), true);
            String s = br.readLine(); // 获取接收的数据
            pw.println(s);            // 发送相同的数据给客户端
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
