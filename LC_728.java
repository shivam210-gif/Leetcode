import java.util.ArrayList;
import java.util.List;

public class LC_728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                list.add(num);
            }
        }

        return list;
    }

    public static boolean isSelfDividing(int num) {
        int original = num;

        while (num > 0) {
            int digit = num % 10; 
            if (digit == 0 || original % digit != 0) {
                return false;
            }

            num /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        int left=1,right=22;
        System.out.print(selfDividingNumbers(left, right));
    }
}
