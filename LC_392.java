public class LC_392 {
    public static boolean isSubsequence(String s, String t) {
        int l = 0; 
        int r = 0; 
        
        while (l < s.length() && r < t.length()) {
            if (s.charAt(l) == t.charAt(r)) {
                l++; 
            }
            r++; 
        }
        
        return l == s.length(); 
    }
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
