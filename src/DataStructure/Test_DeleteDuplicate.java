package DataStructure;

import java.util.Hashtable;
import java.util.Set;

public class Test_DeleteDuplicate {
    // 方法一：遍历链表，把遍历到的值存储到一个Hashtable中，通过Hashtable判断数据是否重复
    // 优点：时间复杂度低，O(n)
    // 缺点：需要额外存储空间，空间复杂度高
    public static void deleteDuplicate1(Node head){
        Hashtable<Integer, Integer> table = new Hashtable<>();
        Node tmp = head;
        Node pre = null;
        while(tmp!= null){
            if(table.containsKey(tmp.data))
                pre.next = tmp.next;
            else
                table.put(tmp.data,1);
                pre = tmp;
            tmp = tmp.next;
        }
        //用Hashtable的keySet()方法，把所有key保存在一个集合里，之后就迭代这个集合，逐个得到value，输出。
        Set<Integer> keys = table.keySet();
        for(Integer key: keys)
            System.out.println(key);
    }

    // 方法二：双重循环遍历链表，外链表正常循环遍历，外循环当前遍历结点为cur，内循环就从cur开始遍历，
    // 若碰到与cur结点值相同，则删除该结点。
    // 优点：不需要额外的存储空间，空间复杂度低
    // 缺点：时间复杂度高，O(n^2)
    public static void deleteDuplicate2(Node head){
        Node p = head;
        // 外循环
        while(p != null){
            Node q = p;
            // 内循环
            while(q.next != null){  // p的下一个结点非空，链表没到头
                if(p.data == q.next.data){ // 如果下个结点的data与p结点相同
                    q.next = q.next.next; // 踢掉这个结点
                }else
                    q = q.next; // 没事了，下一个
            }
            p = p.next; // 内循环走完，下一个外循环
        }
    }

    public static void main(String[] args){ // 测试下
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        deleteDuplicate1(node1);
        deleteDuplicate2(node1);
    }
}
