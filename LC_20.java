import java.util.*;
public class LC_20 {

    public static boolean Valid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // opening
            if(ch=='('||ch=='['||ch=='{'){
                s.push(ch);
            }
            // closing
            else{
                if(s.isEmpty()){
                    return false;
                }
                else{
                    if((s.peek()=='('&&ch==')') || (s.peek()=='{'&&ch=='}') || (s.peek()=='['&&ch==']')){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str ="({})";
        System.out.println(Valid(str));
    }
}

