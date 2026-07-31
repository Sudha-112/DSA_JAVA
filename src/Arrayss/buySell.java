package Arrayss;

public class buySell {

    public static void BuySell(int[] nums){

        int maxProfit = 0;
        int buy = 0;
        int sell = 1;
        while(buy < sell && sell < nums.length){

            if(nums[buy] < nums[sell]) {
                int Profit = nums[sell] - nums[buy];
                maxProfit = Math.max(maxProfit, Profit);

                sell++;
            }
            else {
                buy = sell;
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
