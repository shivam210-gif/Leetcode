public class LC_33{

    public static int search(int num[],int target){
        int n = num.length;
        int start=0;
        int end=n-1;

        while(start<end){
            int mid=(start+end)/2;
            if(num[mid]>num[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        int shift=end;
        start=0;
        end=n-1;

        while(start<=end){
            int mid = (start+end)/2;
            int real_mid=(mid+shift)%n;
            
            if(num[real_mid]==target){
                return real_mid;
            }
            else if(num[real_mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return-1;

    }

    public static void main(String[] args) {
        int num[]={4,5,6,7,0,1,2};
        int target=3;
        System.out.println(search(num, target));
    }
}