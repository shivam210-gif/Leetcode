import java.lang.reflect.Array;
import java.util.Arrays;

public class LC_912 {
    public static void merge_sort(int nums[],int si,int ei){
        int mid=si+(ei-si)/2;
        if(si>=ei){
            return;
        }
        merge_sort(nums,si,mid);
        merge_sort(nums,mid+1,ei);
        merge(nums,si,ei,mid);
    }
    public static void merge(int nums[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }
            else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=ei){
            temp[k++]=nums[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            nums[i]=temp[k];
        }
    }
    public static int[] sortArray(int[] nums) {
        merge_sort(nums,0,nums.length-1);
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={5,2,3,1};
        int[] sortedArray =sortArray(nums);
        System.out.println(Arrays.toString(sortedArray));
    }
}
