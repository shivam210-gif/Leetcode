import java.util.Arrays;

public class LC_2574 {
    public static int[] leftRightDifference(int[] nums) {
        int pref[]=new int[nums.length];
        int suf[]=new int[nums.length];
        pref[0]=0;
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i-1];
        }
        suf[suf.length-1]=0;
        for(int i=suf.length-2;i>=0;i--){
            suf[i]=suf[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(pref[i]-suf[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={10,4,8,3};
        int arr[]=leftRightDifference(nums);
        System.out.print(Arrays.toString(arr)+" ");
    }
}
