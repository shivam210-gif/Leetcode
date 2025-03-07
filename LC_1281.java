public class LC_1281 {
    public static int subtractProductAndSum(int n) {
        int m=n,x=n;
        int sum=0;
        int mul=1;
        while(m>0){
            int d=m%10;
            sum+=d;
            m/=10;
        }
        while(x>0){
            int d=x%10;
            mul*=d;
            x/=10;
        }
        return (mul-sum);
    }
    public static void main(String[] args) {
        int n=234;
        System.out.println(subtractProductAndSum(n));
    }
}
