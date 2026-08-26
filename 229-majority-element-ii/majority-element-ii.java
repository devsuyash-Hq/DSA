import java.util.*;

class Solution { 
    public List<Integer> majorityElement(int[] nums) { 

        List<Integer> ans = new ArrayList<>();     

        int n = nums.length; 

        int element1 = 0; 
        int element2 = 0; 

        int count1 = 0; 
        int count2 = 0; 

        // Step 1: Find potential elements

        for(int i = 0; i < n; i++){ 

            if(count1 == 0 && nums[i] != element2){ 
                element1 = nums[i]; 
                count1++; 
            }  

            else if(count2 == 0 && nums[i] != element1){ 
                element2 = nums[i]; 
                count2++; 
            } 

            else if(nums[i] == element1){ 
                count1++; 
            } 

            else if(nums[i] == element2){ 
                count2++; 
            } 

            else{ 
                count1--; 
                count2--; 
            } 
        }   

        // Step 2: Verify elements

        count1 = 0; 
        count2 = 0; 

        for(int num : nums){ 

            if(num == element1){ 
                count1++; 
            } 

            if(num == element2){ 
                count2++; 
            } 
        }   

        // Step 3: Add valid elements

        if(count1 > n / 3){ 
            ans.add(element1); 
        } 

        if(count2 > n / 3 && element2 != element1){ 
            ans.add(element2); 
        } 

        return ans; 
    } 
}