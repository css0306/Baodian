package JavaBasic;

import java.util.*;
// 在使用iterator()方法时会遇到ConcurrentModificationException异常
// 原因通常在于使用Iterator遍历容器时又对容器做增删操作
// 或者由于多线程操作导致，一个线程使用迭代器遍历容器时另一个对该容器进行增删操作。
public class Test_Iterator2 {
    public static void main(String[] args){
        List<String>ll = new LinkedList<String>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("forth");
        for(Iterator<String> iter = ll.iterator(); iter.hasNext();){
            String str = iter.next();
            System.out.println(str);
            if(str.equals("second"))
                ll.add("five");
        }
    }
}
