package JavaBasic;

import java.util.*;

//import static JavaBasic.Test_HashMap_Key2.test2;//注意：使用其他类内定义的静态方法时要导入

class PersonA extends Person {
    String id;
    String name;

    public int hashCode() {
        return id.hashCode();
    }

    public PersonA(String id, String name) {
        super(id, name);
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "id = " + id + ", name = " + name;
    }

    public boolean equals(Object obj) {
        PersonA p = (PersonA) obj;
        if (p.id.equals(this.id))
            return true;
        else
            return false;
    }
}

public class Test_HashMap_Key3 {
    public static void test3() {
        System.out.println("Use String as key:");
        HashMap<PersonA, String> hm = new HashMap<>();
        PersonA p1 = new PersonA("111", "name1");
        PersonA p2 = new PersonA("111", "name2");
        hm.put(p1, "address1");
        hm.put(p2, "address2");

        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Person key = (Person) entry.getKey();
            String val = (String) entry.getValue();
            System.out.println("key = " + key + "    value = " + val);
        }
    }
    public static void main(String[] args) {
        test3();
    }
}
