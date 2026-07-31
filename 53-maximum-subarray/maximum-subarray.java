class Solution {
    public int maxSubArray(int[] nums) {
        
        int currentsum = 0;
        int maxSum = nums[0];

        for(int num : nums){
            currentsum += num;

              maxSum = Math.max(maxSum, currentsum);

               if(currentsum < 0){
            currentsum = 0;
        }
  }

         return maxSum;
        
    }
   
}