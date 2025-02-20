public class LC_50 {
    public static double myPow(double x, int n) {
        double m=1;
        long pow=n;
 
        if(pow<0){
            x=1/x;
            pow=-pow;
         }
        while(pow>0){
            if(pow%2==1){
             m*=x;
            }
            x*=x;
            pow/=2;
        }
        return m;
    }
    public static void main(String args[]){
        double x=2;
        int n=-2;
        System.out.println(myPow(x, n));
    }

}
