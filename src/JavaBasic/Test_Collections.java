package JavaBasic;

import java.util.*;
public class Test_Collections {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        int array[] = {1, 7, 3, 2};
//        Collections c = new Collections(); // Collections类不能被实例化
//        Collection<Integer> = new Collection<>(); // Collection类是抽象类，也不能实例化
        for(int i = 0; i< array.length; i++){
            list.add(new Integer(array[i]));
        }
        Collections.sort(list); // 提供静态方法sort()，对list中元素进行排序
        for(int i = 0; i < array.length; i++){
            System.out.println(list.get(i));
        }
    }
}
