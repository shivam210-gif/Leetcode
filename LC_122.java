public class LC_122 {
    public static int maxProfit(int[] prices) {
        int BP=Integer.MAX_VALUE;
        int max=0;
        
        for(int i=0;i<prices.length;i++){
            if(BP<prices[i]){
                int profit=prices[i]-BP;
                max+=profit;
                BP=prices[i];
            }
            else{
                BP=prices[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
