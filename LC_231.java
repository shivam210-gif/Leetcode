public class Power_of_two {
    public static boolean isPoweroftwo(int n){
        if(n==1){
            return true;
        }
        else if(n%2!=0 || n<=0){
            return false;
        }
        else{
            return (n & (n-1))==0;
        }

       
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(isPoweroftwo(n));
    }
}
