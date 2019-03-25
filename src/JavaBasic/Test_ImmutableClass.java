package JavaBasic;

import java.util.Date;
import java.util.ArrayList;

class ImmutableClass{
    private Date d;
    public ImmutableClass(Date d){
        this.d = (Date)d.clone(); // 解除了引用关系
    }
    public void printState(){
        System.out.println(d);
    }
public Date getDate(){
        return (Date)d.clone();
    }
}
public class Test_ImmutableClass {
    public static void main(String[] args){
    Date d = new Date();
    ImmutableClass immuC = new ImmutableClass(d);
    immuC.printState();
    d.setMonth(5);
    immuC.printState();
    }
}
