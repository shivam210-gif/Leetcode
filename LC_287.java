import java.util.Arrays;

public class Duplicate_number287 {
    public static int Single(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={3,1,3,4,2};
        System.out.println( Single(nums));
    }
}
