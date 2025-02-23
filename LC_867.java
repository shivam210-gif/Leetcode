public class LC_867 {

    public static void Transpose(int mat[][]){
        int rows=mat.length;
        int col=mat[0].length;
        int mat2[][]=new int[col][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                mat2[j][i]=mat[i][j];
            }
        }
    
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6}};
        Transpose(mat);
    }
    
}
