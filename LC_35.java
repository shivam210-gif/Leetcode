public class LC_35 {
        public static int lower(int arr[],int key){
            int n=arr.length;
            int start=0;
            int end=n-1;
            int ans=n;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]>key){
                    ans=mid;
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return ans;
        }
    
        public static void main(String args[]){
            int arr[]={1,3,5,6};
            int key=2;
            System.out.println(lower(arr, key));
        }
    }

