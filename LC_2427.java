public class LC_2427 {
    public static int commonFactors(int a, int b) {
        int num=Math.max(a,b);
        int count=0;
        for(int i=1;i<=num;i++){
            if(a%i==0&&b%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 12, b = 6;
        System.out.println(commonFactors(a, b));
    }
}
