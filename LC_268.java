import java.util.Arrays;

public class Missing_no268 {
    public static int Missing_no(int arr[],int n){
        int count1=0,count2=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            count1+=arr[i];
        }
        for(int i=0;i<=n;i++){
            count2+=i;
        }
        return count2-count1;
        
    }
    public static void main(String[] args) {
        int arr[]={0};
        int n=arr.length;
        System.out.println(Missing_no(arr,n));
    }
}
