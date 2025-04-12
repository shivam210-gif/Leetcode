import java.util.Stack;

public class LC_503 {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s =new Stack<>();
        int nxtgreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            // 1 while loop
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }

            // If else
            if(s.isEmpty()){
                nxtgreater[i]=-1;
            }
            else{
                nxtgreater[i]=s.peek();
            }

            // push
            s.push(arr[i]);
        }

        for(int i=0;i<nxtgreater.length;i++){
            System.out.print(nxtgreater[i]+" ");
        }
    }
}
