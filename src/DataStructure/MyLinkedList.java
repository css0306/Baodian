package DataStructure;

public class MyLinkedList {
    Node head = null; // 链表头的引用。初始设为空链表

    /* 向链表中（尾部）插入数据
    @param d:插入数据的内容
    */
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        //在链表尾添加新结点
        tmp.next = newNode;
    }

    /* @param index：删除第index个结点
    @return 成功返回true，失败返回false
    */
    public boolean deleteNode(int index) { // 删除元素的位置不合理
        if (index < 1 || index > length()) {
            return false;
        }
        // 删除链表第一个元素
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 2; // 从第2个结点开始
        Node preNode = head;
        Node curNode = preNode.next; // 当前结点curNode为头指针的下一个结点
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next; // 将指针直接链接到下个结点
                return true; // 返回删除成功
            }
            preNode = curNode; // 将上一结点设为当前结点，开始下一轮删除
            curNode = curNode.next;
            i++; // 这样遍历岂不是很麻烦？？
        }
        return true;
    }

    /*
        返回结点长度
    */
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) { // 初始长度设为0，设置指针tmp，从头结点开始，只要所指结点不为空，则长度length+1
            length++;
            tmp = tmp.next;
        }
        return length;
    }
/*
    对链表排序
    返回排序后头结点
    */
    public Node orderList(){
        Node nextNode = null;
        int temp = 0;
        Node curNode = head;
        while(curNode.next != null){
            nextNode = curNode.next;
            while(nextNode != null){
                if(curNode.data > nextNode.data){
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }
/*
    打印链表
    */
    public void printList(){
        Node tmp = head;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.addNode(3);
        list.addNode(1);
        list.addNode(5);
        list.addNode(3);
//        list.deleteNode(1);
//        System.out.println("listLen = "+ list.length());
//        System.out.println("before order:");
//        list.printList();
//        list.orderList();
//        System.out.println("after order");
        list.printList();
    }
}

