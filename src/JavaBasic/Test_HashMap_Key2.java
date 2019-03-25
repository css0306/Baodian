package JavaBasic;

import java.util.*;

// 用自定义的类Person作为HashMap的key时,会给人造成一种key可以重复的假象
class Person{
    String id;
    String name;
    public Person(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "id = "+id+", name = "+name;
    }
}

public class Test_HashMap_Key2 {
    public static void test2(){
        System.out.println("Use String as key:");
        HashMap<Person,String> hm = new HashMap<>();
        Person p1 = new Person("111", "name1");
        Person p2 = new Person("111", "name1");
        hm.put(p1, "address1");
        hm.put(p2,"address1");

        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            Person key = (Person)entry.getKey();
            String val = (String)entry.getValue();
            System.out.println("key = "+key+"    value = "+val);
        }
    }
    public static void main(String[] args){
        test2();
    }
}
