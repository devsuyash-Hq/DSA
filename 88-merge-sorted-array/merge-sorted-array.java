import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = 0;

        // Compare nums1 and nums2
        while (i >= 0 && j < n) {

            if (nums1[i] > nums2[j]) {

                // Swap
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;

                i--;
                j++;
            } 
            else {
                break;
            }
        }

        // Sort the valid part of nums1
        Arrays.sort(nums1, 0, m);

        // Sort nums2
        Arrays.sort(nums2);

        // Copy nums2 into the empty part of nums1
        for (int k = 0; k < n; k++) {
            nums1[m + k] = nums2[k];
        }
    }
}