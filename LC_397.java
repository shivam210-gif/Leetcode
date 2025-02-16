public class LC_397 {
    public static int Count(long n,int count){
        if(n==1){
            return count;
        }
        if(n%2==0){
            return Count(n/2,count+1);
        }
        else{
            return Math.min(Count(n+1,count+1),Count(n-1,count+1));
        }
    }
    public static int integerReplacement(int n) {
        return Count((long)n,0);
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(integerReplacement(n));
    }
}
