package JavaBasic;

// 接口中定义一个用来比较大小的方法cmp()
// 通过定义一个用来比较大小的接口IntCompare，来充当C语言中函数指针的功能，使用时可根据需求传入自定义的类。
interface IntCompare{
    public int cmp(int a, int b);
}
class Cmp1 implements IntCompare{
    public int cmp(int a, int b){
        if(a>b)
            return 1;
        else if(a<b)
            return -1;
        else
            return 0;
    }
}
class Cmp2 implements IntCompare{
    public int cmp(int a, int b){
        if(a>b)
            return -1;
        else if(a<b)
            return 1;
        else
            return 0;
    }
}
public class Test_Function_Pointer { // 用插入排序进行测试
    public static void insertSort(int[] a, IntCompare cmp){ //数组a[]
        if(a!=null){
            for(int i =1; i<a.length; i++){
                int temp = a[i], j=i;
                if(cmp.cmp(a[j-1],temp)==1){
                    while(j>=1 && cmp.cmp(a[j-1],temp)==1){
                        a[j]=a[j-1];
                        j--;
                    }
                }
                a[j]=temp;
            }
        }
    }
    public static void main(String[] args){
        int[] array1 = {7,3,19,40,4,7,1};
        insertSort(array1, new Cmp1());
        System.out.print("升序排序：");
        for(int i=0; i<array1.length;i++)
            System.out.print(array1[i]+" ");
        System.out.println();
        int[] array2 = {7,3,19,40,4,7,1};
        insertSort(array2, new Cmp2());
        System.out.print("降序排序：");
        for(int i=0;i<array2.length;i++)
            System.out.print(array2[i]+" ");
    }
}
