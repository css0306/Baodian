package JavaBasic;

import java.util.*;
public class Test_Iterator {
    public static void main(String[] args){
        List<String>ll = new LinkedList<String>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("fourth");
        for(Iterator<String> iterator = ll.iterator(); iterator.hasNext();){
            String str = (String) iterator.next();
            System.out.println(str);
        }
    }
}
