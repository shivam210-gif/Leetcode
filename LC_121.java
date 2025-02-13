public class BuyanSellstocks {

    public static int max_profit(int prices[]){
        int max_profit=0;
        int BP=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>BP){
                int profit=prices[i]-BP;
                max_profit=Math.max(max_profit,profit);
            }
            else{
                BP=prices[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[]={2,1,8,10,11};
        System.out.println("Maximum profit is:"+max_profit(prices));
    }
}
