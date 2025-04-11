import java.util.Arrays;

public class LC_2640 {
    public static long[] findPrefixScore(int[] nums) {
        long con[]=new long[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            con[i]=nums[i]+max;
        }
        long arr[]=new long[nums.length];
        arr[0]=con[0];
        for(int i=1;i<con.length;i++){
            arr[i]=con[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[]={2,3,7,5,10};
        System.out.println(Arrays.toString(findPrefixScore(nums)));
    }
}
