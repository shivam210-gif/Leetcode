public class Rotate_array {
    public static void Single(int nums[],int k) {
        int n = nums.length;
        k = k % n;  

        int temp[] = new int[k];

        
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        Single(nums,3);
    }
}
