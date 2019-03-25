package DataStructure;

public class Test_Max_Subsection_Sum {

    // 最大子段和简单算法(暴力求法)
    public static void maxSumSimple(int array[], int bestx, int besty) {
        int n = array.length, sum = 0;
        for (int i = 1; i <= n; i++) {
            int thissum = 0;
            for (int j = i; j <= n; j++) {
                thissum += array[j - 1];
                if (thissum > sum) {
                    sum = thissum;
                    bestx = i;
                    besty = j;
                }
            }
        }
        System.out.println("简单算法最优值：" + sum);
        System.out.println("最优解：" + bestx + "-->" + besty);
    }

    // 最大子段和分治法, 最终返回int sum即为最大子段和
    public static int maxSumDivide(int array[], int left, int right) {
        int sum = 0;
        if (left == right) {
            sum = array[left] > 0 ? array[left] : 0;
        } else {
            int mid = (left + right)/2; // 连续内存和下标，取中
            int leftSum = maxSumDivide(array, left, mid);
            int rightSum = maxSumDivide(array, mid + 1, right);
            int s1 = 0;
            int lefts = 0;
            for (int i = mid; i >= left; i--) { // 因为子段和中间必须是相连的，所以左边必须从右向左加，而不能从左向右计算。
                lefts += array[i];
                if (lefts > s1) {
                    s1 = lefts;
                }
            }
            int s2 = 0;
            int rights = 0;
            for (int i = mid + 1; i <= right; i++) {
                rights += array[i];
                if (rights > s2) {
                    s2 = rights;
                }
            }
            sum = s1 + s2;
            // 比较整个的最大子段和和分治后两段的结果
            // 如果没有分治后的大，则最大和为分治后的左端或右端结果
            // 不用比较左端和右端谁结果更大
            if (sum < leftSum) {
                sum = leftSum;
            }
            if (sum < rightSum) {
                sum = rightSum;
            }
        }
        return sum;
    }

    // 最大子段和动态规划法实现 动态规划即实时记录上一步的结果，与当前步的结果进行比较，得到每一步的最优结果。
    public static void maxSumDynamicProgramming(int[] arr) {
        int sum = 0, b = 0, n = arr.length, bestx = 0, besty = 0;
        for (int i = 1; i <= n; i++) {
            if (b > 0) {
                b += arr[i - 1];
            } else {
                b = arr[i - 1];
                bestx = i;
            }
            if (b > sum) {
                sum = b;
                besty = i;
            }
        }
        System.out.println("动态规划算法最优值：" + sum);
        System.out.println("最优解：" + bestx + "-->" + besty);
    }

    public static void main(String[] args) {
        int[] array = { 2,5,-3,4,-9,44,32,22,11,-30 };
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("最大子段和：");
        System.out.println("分治算法最优值：" + maxSumDivide(array, 0, array.length - 1));
        System.out.println("====================");
        maxSumDynamicProgramming(array);
        System.out.println("====================");
        maxSumSimple(array, 0, 0);
    }
}