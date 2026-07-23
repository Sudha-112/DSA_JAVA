package Arrayss;

public class FindLeaders {

    public static void Leaders(int[] nums){

        int n = nums.length;
        System.out.print("The leaders are ");

        if(n==0){
            System.out.print("None");
        }else {
            System.out.print(nums[n - 1] + " ");
        }
        int i = n-2;
        int k = n-1;

        while(i>=0 && i < k && k < nums.length){
            int count = 0;
            for(int j = k; j < nums.length; j++){

                if(nums[i] > nums[j]){
                    k++;
                    count++;
                }else{
                    break;
                }
            }

            if(count == n-i-1){
                System.out.print(nums[i]+ " ");
            }

            i--;
            k=i+1;
        }

    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4};

        Leaders(arr);
    }

}
