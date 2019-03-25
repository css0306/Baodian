package DataStructure;

public class Test_Merge_Sort {
    public static void Merge(int array[], int low, int mid, int high){  //Merge()将前后相邻的两个有序表归并为一个有序表
        int i,j,k;
        int n1 = mid - low + 1; // n1为左序列中元素个数
        int n2 = high - mid; // n2为右序列中元素个数
        int[] L = new int[n1]; // 左序列L
        int[] R = new int[n2]; // 右序列R
        // L,R各自有序，将它们合并成一个有序表
        for(i=0, k=low; i<n1; i++, k++) // 左边k从low开始，k++，i从0到n1自增，用于为左序列中元素计数
            L[i] = array[k]; //将左序列中元素复制给array[]
        for(i=0, k=mid+1; i<n2; i++, k++) // 右边k从mid+1开始，k++，i从0到n2自增，用于为右序列中元素计数
            R[i] = array[k]; //将右序列中元素复制给array[]
        for(k=low, i=0, j=0; i<n1 && j<n2; k++){ // 比较左右两段中的元素
            if(L[i]>R[j]){
                array[k] = L[i];
                i++;
            }else{
                array[k] = R[j];
                j++;
            }
        }
        // 检测两表是否检测完，其中只有一个会执行。当L，R中有一个的下标超出其对应表长时，表示该段的元素已全复制到array中。
        // 故将另一段直接复制到array中。
        if(i<n1){
            for(j=i; j<n1; j++, k++)
                array[k] = L[j];
        }
        if(j<n2){
            for(i=j; i<n2; i++, k++)
                array[k] = R[i];
        }
    }
    public static void MergeSort(int array[], int low, int high){
        if(low < high){
            int mid = (low + high)/2;
            MergeSort(array,low,mid);
            MergeSort(array,mid+1,high);
            Merge(array,low,mid,high);
        }
    }
    public static void main(String[] args){
        int a[] = {49,38,65,97,76,13,27};
        int len = a.length;
        MergeSort(a,0,len-1); // low = 0, high = len-1
        for(int i=0; i<len; i++)
            System.out.print(a[i] + " ");
    }
}
