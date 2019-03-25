package JavaBasic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Singleton { // 单例模式
    private static Singleton instance = null;
    private Singleton(){} // 使用private隐藏类的构造器
    public static Singleton getInstance(){ // 提供一个创建对象的方法，把创建对象的方法声明为static
        if(instance == null){
            instance = new Singleton();
        }
        return instance; //通过getInstance()方法返回对象的一个实例
    }

    public static class Test_Iterator {
        public static void main(String[] args){
            List<String> ll = new LinkedList<String>();
            ll.add("first");
            ll.add("second");
            ll.add("third");
            ll.add("fourth");
            for(Iterator<String> iter = ll.iterator(); iter.hasNext();){
                String str = iter.next();
                System.out.println(str);
            }
        }
    }
}
