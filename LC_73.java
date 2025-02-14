public class matrix_zero73 {
    public static void zero(int mat[][]) {
        int m = mat.length;
        int n = mat[0].length;

        boolean[] rows = new boolean[m]; 
        boolean[] cols = new boolean[n]; 

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        
        for (int i = 0; i < m; i++) {
            if (rows[i]) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = 0;
                }
            }
        }

        
        for (int j = 0; j < n; j++) {
            if (cols[j]) {
                for (int i = 0; i < m; i++) {
                    mat[i][j] = 0;
                }
            }
        }

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};

        zero(mat);
    }
}
