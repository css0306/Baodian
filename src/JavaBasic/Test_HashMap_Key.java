import java.util.*;
// HashMap和HashTable不能存储重复的键。
public class Test_HashMap_Key {
    public static void test1(){
        System.out.println("Use user defined class key:");
        HashMap<String,String> hm = new HashMap<>();
        hm.put("aaa", "bbb");
        hm.put("aaa", "ccc");

        Iterator iter = hm.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();//Map.Entry是Map的一个内部接口，可同时获得键和值
            String key = (String)entry.getKey();
            String val = (String)entry.getValue();
            System.out.println(key+"     "+val);
        }
    }
    public static void main(String[] args){
        test1();
    }
}// 若使用同样的键，则新添加的值会覆盖已添加的值。
