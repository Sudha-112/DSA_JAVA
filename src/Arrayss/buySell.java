package Arrayss;

public class buySell {

    public static void BuySell(int[] nums){

        int maxProfit = 0;
        int buy = 0;
        int sell = 1;
        while(buy < sell && sell < nums.length){

            int Profit = nums[sell] - nums[buy];
            if(Profit < 0){
              buy++;
              sell++;
            }else if(Profit > maxProfit){
                maxProfit = Profit;
                sell++;
            }
            else{
                sell++;
            }

        }

        System.out.println(maxProfit);

    }
    public static void main(String[] args){

        int[] arr = {7,6,4,3,1};

        BuySell(arr);
    }

}
