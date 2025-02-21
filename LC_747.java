import java.util.Arrays;

public class Largest_number_747 {
    
    public static int Largest(int nums[]){
        int n=nums.length;
        int count=0;
        int index=0;
        int Largest=Integer.MIN_VALUE; 
        for(int i=0;i<n;i++){
            if(nums[i]>=Largest){
                Largest=nums[i];
                index=i;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]*2<=nums[n-1]){
                count++;
            }
            if(count==n-1){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={3,6,1,0};
        System.out.println(Largest(num));
    }
}
