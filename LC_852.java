public class LC_852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[mid+1]){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]={0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
