import java.util.Arrays;

public class InsertSort{

    static void insertSort(int[] nums){
        int i,j,k;
        int len = nums.length; 
        for(i = 1;i<len;i++){
            //在前i[0:i-1]个已经拍好序中的数组找到nums[i] 要插入的位置
            for(j=i-1;j>=0;j--){
                //索引从i-1到0 找到一个 j 是的nums[j]<nums[i] [j+1:i-1]都比[i]大
                if(nums[j]<nums[i])
                    break;
            }
            //找到j后
            if(j!=i-1){
                int temp = nums[i];
                //从[j:i-1]->[j+1:i]将[j:i-1]的值往后推一位
                for(k=i-1;k>j;k--)
                    nums[k+1] = nums[k];
                //将nums[i]赋给nums[j]
                nums[k+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {20,40,30,10,60,50};
        System.out.println("排序前："+Arrays.toString(a));
        insertSort(a);
        System.out.println("排序后："+Arrays.toString(a));
    }

}