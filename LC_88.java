import java.util.Arrays;

public class LC_88 {
    public static void Sort(int nums1[],int nums2[],int n,int m){
        int j=0;
        for(int i=m;i<n+m;i++){
            nums1[i]=nums2[j];
            j++;
           
        }
       
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]);
        }
    }
    public static void main(String[] args) {
        int num1[]={1,3,5,7,0,0,0,0,0};
        int num2[]={0,2,6,8,9};
        int m=4,n=5;
        Sort(num1, num2, n, m);


    }
}
