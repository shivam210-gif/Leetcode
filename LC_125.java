public class LC_125 {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
             char c=s.charAt(i);
             if(Character.isLetterOrDigit(c)){
                 str.append(Character.toLowerCase(c));
             }
        }
        int start=0,end=str.length()-1;
        while(start<=end){
             if(str.charAt(start)!=str.charAt(end)){
                 return false;
             }
             start++;
             end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
