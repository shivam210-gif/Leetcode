import java.util.*;
public class LC_84 {
    public static int maxarea(int height[]){
        Stack<Integer> s = new Stack<>();
        int max=0;
        int nsl[]=new int[height.length];
        int nsr[]=new int[height.length];

        // next smaller right
        for(int i=height.length-1;i>=0;i--){
            while (!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=height.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        s= new Stack<>();

        // next smaller left
        for(int i=0;i<height.length;i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        // area
        for(int i=0;i<height.length;i++){
            int ht=height[i];
            int width=nsr[i]-nsl[i]-1;
            int area=ht*width;
            max=Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(maxarea(heights));
    }
}
