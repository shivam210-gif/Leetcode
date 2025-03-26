import java.util.Arrays;

public class LC_645 {
    public static int[] findErrorNums(int[] nums) {
        int arr[]=new int[nums.length+1];
        int arr2[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        for(int i=1;i<=nums.length;i++){
            if(arr[i]==2){
                arr2[0]=i;
            }
            else if(arr[i]==0){
                arr2[1]=i;
            }
        }
        return arr2;    
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
