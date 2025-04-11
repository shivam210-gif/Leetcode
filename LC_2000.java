import java.util.Stack;

public class LC_2000 {
    public static String reversePrefix(String word, char ch) {
        Stack<Character> s = new Stack<>();
        int idx=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                idx=i;
                break;
            }
        }
        int j=0;
        while(j<=idx){
            s.push(word.charAt(j));
            j++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        for(int i=idx+1;i<word.length();i++){
            result.append(word.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
}
