public class LC_48 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        
    }
    public static void main(String[] args) {
        int matix[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matix);

    }
}
