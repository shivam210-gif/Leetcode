public class Power_of_three{
    public static boolean isPowerOfThree(int n) {
        if(n%2==0 || n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        n=n/3;
        return isPowerOfThree(n);
    }
    public static void main(String[] args) {
        int n=27;
        System.out.println(isPowerOfThree(n));
    }
}