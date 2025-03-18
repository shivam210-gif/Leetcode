import java.util.Arrays;

public class Lc_1299 {
    public static int[] replaceElements(int[] arr) {
        int arr2[]=new int[arr.length];
        if(arr.length==1){
            arr2[0]=-1;
            return arr2;
        }
        arr2[arr2.length-1]=-1;
        for(int i=arr2.length-2;i>=0;i--){
            arr2[i]=Math.max(arr2[i+1],arr[i+1]);
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        System.out.print(Arrays.toString(replaceElements(arr)));
    }

}
