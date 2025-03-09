import java.util.Arrays;

public class LC_2965 {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[2];
        int k=0;
        int n = grid.length;
        int N = n * n;
        int[] freq = new int[N + 1]; 
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                freq[grid[i][j]]+=1;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                arr[k++]=i;
            }
        }
        for(int i=1;i<=freq.length;i++){
            if(freq[i]==0){
                arr[k++]=i;
                break;
            }   
        }
        return arr;
    }
    public static void main(String[] args) {
        int grid[][]={{1,3},{2,2}};
        int arr[]=findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(arr));
    }
}
