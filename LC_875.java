public class LC_875 {
    public static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }

        int low=0;
        int high=max;
        int ans=0;
        int total_hrs=0;
        while(low<=high){
            int mid = (low+high)/2;
            total_hrs=totalhours(piles,mid);
            if(total_hrs<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    
    }
    public static int totalhours(int piles[],int mid){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+=Math.ceil((double)piles[i]/(double)mid);
        }
        return total;
    }
    public static void main(String[] args) {
        int piles[]={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
