import java.util.ArrayList;
import java.util.List;

public class LC_2150 {
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>lar){
                lar=nums[i];
            }
        }
        int arr[]=new int[lar+2];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 1 && (i == 0 || arr[i - 1] == 0) && arr[i + 1] == 0) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {10,6,5,8};
        System.out.print(findLonely(nums)+" ");
    }
}
