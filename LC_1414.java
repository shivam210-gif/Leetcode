import java.util.ArrayList;

public class LC_1414 {
    public static int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> fibList = new ArrayList<>();
        int a = 1, b = 1;
        fibList.add(a);
        while (b <= k) {
            fibList.add(b);
            int temp = a + b;
            a = b;
            b = temp;
        }

        int count = 0;
        int index = fibList.size() - 1; 

        while (k > 0) {
            if (fibList.get(index) <= k) {
                k -= fibList.get(index);
                count++;
            }
            index--;
        }
        return count;
        
    }
    public static void main(String[] args) {
        int k=19;
        System.out.println(findMinFibonacciNumbers(k));
    }
}
