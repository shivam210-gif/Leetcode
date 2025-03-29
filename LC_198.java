public class LC_198 {
    public static int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length ==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int curr=0;
        int prev1=nums[0];
        int prev2=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
             curr=Math.max(prev2,prev1+nums[i]);
             prev1=prev2;
             prev2=curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(rob(nums));
    }
}
