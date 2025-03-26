public class LC_5 {
    public static boolean isPalindrome(String s,int i,int j){
        int x=0,y=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
           i++;
           j--;
        }
        return true;
    }
   public static String longestPalindrome(String s) {
        int max=0;
        int start=0,end=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s, i, j)==true){
                    if((j-i+1)>max){
                        max=(j-i+1);
                        start=i;
                        end=j;
                    }
                }
            }
        }  
        return (s.substring(start, end+1));  
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
