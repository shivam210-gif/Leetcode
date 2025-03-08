import java.util.Arrays;

public class LC_1365{
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        int k=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
               if(nums[i]>nums[j])
               count++;
            }
            arr[k++]=count;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3};
        int arr2[]=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(arr2));
    }
}