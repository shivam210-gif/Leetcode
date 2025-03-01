public class Power_of_Four {
    public static boolean Single(double n){
        if(n==1){
            return true;
        }
        if(n%2!=0 || n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        n=n/4;
        return Single(n);
    }
    public static void main(String[] args) {
        double n=64;
        System.out.println( Single(n));
    }
}
            