class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int positive = 0;
        int Negative = 1;

        for(int num : nums){
            if(num > 0){
                ans[positive] = num;
                positive += 2;

            }
            else{
                ans[Negative] = num;
                Negative += 2;
            }
        }
        return ans;
        
    }
}