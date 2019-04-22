import java.util.Arrays;

/**
 * created by xifoo 4-22
**/
public class BubbleSort{

    /**
     * @param nums
     */
    void bubblesort(int[] nums){
        int len = nums.length;
        //外循环
        for(int i=0;i<len-1;i++){
            //内循环 每一次内循环结束后 未拍好中的最大值总是排在最后 可以让最大值不参与排序了
            for(int j=0;j<len-1-i;j++){
                if(nums[j]>nums[j+1])
                    swap(nums,j,j+1);
            }
        }
    }

    /**
     * 改进版，设置一个参数，若在一次内循环中，没有发生交换，则说明已经排好
     * @param nums
     */
    void bubblesort1(int[] nums){
        int len = nums.length;
        //外循环
        boolean isswap;
        for(int i=0;i<len-1;i++){
            //每次进入循环置为false
            isswap = false;
            //内循环 每一次内循环结束后 未拍好中的最大值总是排在最后 可以让最大值不参与排序了
            for(int j=0;j<len-1-i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                    isswap = true;
                }
            }
            //没有交换 不在循环
            if(!isswap)
                break;
        }
    }
    void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1,10,25,45,67,78,89,90,111,123};
        System.out.println(Arrays.toString(arr));
        BubbleSort b = new BubbleSort();
        b.bubblesort(arr);
        //b.bubblesort1(arr);
        System.out.println(Arrays.toString(arr));
    }
}