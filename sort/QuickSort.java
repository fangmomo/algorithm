import java.util.Arrays;

public class QuickSort {

    void quicksort(int[] nums, int left, int right) {
        
        if(left<right){
            int i = left;
            int j = right;
            int temp = nums[i];
            while (i < j) {

                // 从右向左找，找到一个比基准小的数，将j上的值赋给位置i nums[i] = nums[j];
                while (i < j && nums[j] >= temp)
                    j--;
                if (j > i) {
                    nums[i++] = nums[j];
                }

                // 从左向右找，找到一个比基准大的数，将i上的值赋给位置j nums[j] = nums[i];
                while (i < j && nums[i] <= temp)
                    i++;
                
                if (j > i)
                    nums[j--] = nums[i];
            }
            // 左右指针指向同一个位置时，将基准值赋给这个位置
            nums[i] = temp;
            quicksort(nums, left, i - 1);/* 递归左边 */
            quicksort(nums, i + 1, right);/* 递归右边 */
        }
    }

    public static void main(String[] args) {

        int[] a = new int[]{8,2,6,12,1,9,5,5,10};
        QuickSort q = new QuickSort();
        System.out.println("排序前");
        for(int i:a)
            System.out.print(i+"->");
        System.out.println("排序后");
        q.quicksort(a, 0, a.length-1);
        for(int i:a)
            System.out.print(i+"->");
    }

}