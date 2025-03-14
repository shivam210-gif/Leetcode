public class LC_258 {
    public static int Add(int num){
        if(num/10==0){
            return num;
        }
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return Add(num=sum);
        
    }
    public static void main(String[] args) {
        int num=38;
        System.out.println(Add(num));

        // // Direct Formula:
        // int digit=1+(num-1)%9;
        // System.out.println(digit);
    }
}
