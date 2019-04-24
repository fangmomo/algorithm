import java.util.Arrays;

public class ShellSort{

     /**
     * 希尔排序 针对有序序列在插入时采用移动法。
     * @param nums
     */
    static void shellsort(int nums[]){

        //gap的值逐渐缩小
        for(int gap=nums.length/2;gap>0;gap/=2){

            for(int i=gap;i<nums.length;i++){
                int j=i;
                //判断nums[i]  和 在它前跟它相差 gap的nums[i-gap]的值，交换使其排序
                while(j-gap>0 && nums[j]<nums[j-gap]){
                    swap(nums,j,j-gap);
                    j-=gap;
                }
            }
        }

    }
    static void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int []arr ={1,4,2,7,9,8,3,6};
        System.out.println("before:"+Arrays.toString(arr));
        shellsort(arr);
        System.out.println("after:"+Arrays.toString(arr));
    }


}