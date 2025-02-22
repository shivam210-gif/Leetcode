public class LC_371 {
    public static int getSum(int a, int b) {
        while (b > 0) { 
            a++;
            b--;
        }
        while (b < 0) {
            a--;
            b++;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=2,b=3;
        System.out.println(getSum(a,b));
    }
}

