public class LC_283 {
    public static void Single(int nums[]){
        int temp=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]==0){
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
            
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        Single(nums);
    }
}

