public class LC_1732 {
    public static int largestAltitude(int[] gain) {
        int pref[]=new int[gain.length+1];
        pref[0]=0;
        for(int i=1;i<=gain.length;i++){
            pref[i]=pref[i-1]+gain[i-1];
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<pref.length;i++){
            if(largest<pref[i]){
                largest=pref[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
