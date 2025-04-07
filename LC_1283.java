public class LC_1283 {
    public static int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=Sum(nums,mid);
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int Sum(int nums[],int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)mid);
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={1,2,5,9};
        int  threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
