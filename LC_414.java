public class Third_largest {
    public static int third_largest(int nums[]){
        long largest1=Long.MIN_VALUE;
        long largest2=Long.MIN_VALUE;
        long largest3=Long.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num==largest1 || num==largest2 || num==largest3){
                continue;
            }
            else if(num>largest1){
                largest3=largest2;
                largest2=largest1;
                largest1=num;
                count++;
            }
            else if(num>largest2){
                largest3=largest2;
                largest2=num;
                count++;
            }
            else if(num>largest3){
                largest3=num;
                count++;
            }
        }
        if(count>=3){
            return (int)largest3;
        }
        else{
            return (int)largest1;
        }
    }
    public static void main(String[] args) {
        int nums[]={3,2,1};
        System.out.println(third_largest(nums));
    }
}
