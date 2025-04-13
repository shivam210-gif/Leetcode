public class LC_3115 {
    public static int maximumPrimeDifference(int[] nums) {
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        if(first==-1 || last==-1 || first==last){
            return 0;
        }
        return Math.abs(last-first);
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
       return true;
    }
    public static void main(String[] args) {
        int nums[] = {4,2,9,5,3};
        System.out.println(maximumPrimeDifference(nums));
    }
}
