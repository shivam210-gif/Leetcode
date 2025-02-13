// import java.util.Arrays;

public class Single_number136 {
    public static int single(int num[]){
        int res=0;
        for(int i=0;i<num.length;i++){
           res=res^num[i];;
        }
        return res;
    }
    public static void main(String[] args) {
        int num[]={4,1,2,1,2,};
        System.out.println(single(num));
    }
}
