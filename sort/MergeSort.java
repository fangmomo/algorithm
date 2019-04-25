import java.util.Arrays;

    /**
     * 归并排序  分而治之 
     * 
     */
public class MergeSort {
    static void mergeSort(int[] nums){
        int []temp = new int[nums.length];
        mergesort(nums,0,nums.length-1,temp);
    }
    static void mergesort(int[] nums,int left,int right,int temp[]){
        if(left<right)
        {
            int mid = (left+right)/2;
            mergesort(nums, left, mid, temp);//左边归并排序 使左边有序
            mergesort(nums, mid+1, right, temp);//右边归并排序 使右边有序
            merge(nums,left,mid,right,temp);//合并
        }
    }
    private static void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int le = left;
        int ri = mid+1;
        int t=0;
        while(le<=mid&&ri<=right){
            if(nums[le]<nums[ri])
                temp[t++] = nums[le++];
            else
                temp[t++] = nums[ri++];
        }
        //左子序剩余的填充至temp
        while(le<=mid){
            temp[t++] = nums[le++];
        }
        //右子序剩余的填充至temp
        while(ri<=right)
            temp[t++] = nums[ri++];
        t= 0;
        while(left <= right){
            nums[left++] = temp[t++];
        }
    }
    public static void main(String[] args) {
        int []arr = {9,8,7,6,5,4,3,2,1};
        System.out.println("before:"+Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("after:"+Arrays.toString(arr));
    }

}