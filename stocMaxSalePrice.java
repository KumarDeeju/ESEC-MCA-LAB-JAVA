public class stocMaxSalePrice {
    public static int maxProfit(int[] price){
        int maxPro = Integer.MAX_VALUE;
        int profit = 0;
            // 7 1 5 3 6 4
        for(int i=0;i<price.length;i++){
            if(maxPro < price[i]){ // 42544 < 7 || 7 < 1|| 1< 5 || 1 < 3|| 1 < 6 || 1 < 4
                int myProf = price[i] - maxPro; // 5-1=4, 3 - 1=2, 6 - 1=5, 4-1=3

                profit = Math.max(profit, myProf); // (0, 4) = 4 || (4, 2) = 4||(4, 5) = 5|| (5, 3) = 5
            }else{
                maxPro = price[i]; // 7,1,
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
}