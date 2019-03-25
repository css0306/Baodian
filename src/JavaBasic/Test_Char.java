package JavaBasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_Char {
    public static void getLength(String str) {
        System.out.println(str + " 的长度：" + str.length() + " 所占字节数：" + str.getBytes().length);
    }

    public static void judgeChineseCharacter(String str) {
        String regEx = "[\u4300-\u9fa5]";
        // 判断是否存在中文字符,若字符串长度和所占字节数相同则说明不是汉字
        if (str.getBytes().length == str.length()) {
            System.out.println("无汉字");
        } else {// 若存在中文字符，找出字符串中的中文字符
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(str);
            while (m.find()) {
                System.out.print(m.group(0) + "");
            }
        }
    }
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "你好";
        getLength(s1);
        getLength(s2);
        judgeChineseCharacter("Hello World");
        judgeChineseCharacter("Hello 你好");
    }
}