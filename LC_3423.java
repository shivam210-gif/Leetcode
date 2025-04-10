public class LC_3423 {
    public static int maxAdjacentDistance(int[] nums) {
        int max=0;
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
           if(i==0){
            int diff1=Math.abs(nums[i]-nums[nums.length-1]);
            diff=Math.abs(nums[i]-nums[i+1]);
            max=Math.max(diff1,diff);
           }
           diff=Math.abs(nums[i]-nums[i+1]);
           max=Math.max(max,diff);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={1,2,4};
        System.out.println(maxAdjacentDistance(nums));
    }
}
