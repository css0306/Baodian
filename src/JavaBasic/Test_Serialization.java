package JavaBasic;

import java.io.*;

class People implements Serializable {
    private int age;
    private String name;

    public People() {
        this.name = "lili";
        this.age = 20;
    }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public static void main(String[] args) {
        People p = new People();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            FileOutputStream fos = new FileOutputStream("people.out");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
        } catch (Exception ex) {
        }
        People p1;
        try {
            FileInputStream fis = new FileInputStream("people.out");
            ois = new ObjectInputStream(fis);
            p1 = (People) ois.readObject();
            System.out.println("name:" + p1.getName());
            System.out.println("age:" + p1.getAge());
            ois.close();
        } catch (Exception ex) {
        }
    }
}
