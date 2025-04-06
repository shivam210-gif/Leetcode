public class LC_45 {
    public static int jump(int[] nums) {
        int farthest=0;
        int jumps=0;
        int currend=0;
 
        for(int i=0;i<nums.length-1;i++){
             farthest=Math.max(farthest,i+nums[i]);
             if(i==currend){
                jumps++;
                currend=farthest;
             }
        }
        return jumps;
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
