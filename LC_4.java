public class LC_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int merge[]=new int[n+m];
        int k=0,i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merge[k++]=nums1[i++];
            }
            else{
                merge[k++]=nums2[j++];
            }
        }
        while(i<m) merge[k++]=nums1[i++];
        while(j<n) merge[k++]=nums2[j++];

        int len=merge.length;
        if(len%2==1){
            return merge[len/2];
        }
        else{
            return (merge[len/2 -1]+merge[len/2])/2.0;
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,3} ,nums2[] = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
