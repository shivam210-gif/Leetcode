public class LC_55 {
    public static boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<=nums.length-1;i++){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
