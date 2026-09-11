class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by starting point
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Store merged intervals
        List<int[]> result = new ArrayList<>();

        // Step 3: Traverse all intervals
        for (int[] current : intervals) {

            // If result is empty OR there is no overlap
            if (result.isEmpty() ||
                result.get(result.size() - 1)[1] < current[0]) {

                // Add current interval
                result.add(current);

            } else {

                // Overlap exists
                int[] last = result.get(result.size() - 1);

                // Merge the intervals
                last[1] = Math.max(last[1], current[1]);
            }
        }

        // Step 4: Convert List to 2D array
        return result.toArray(new int[result.size()][]);
    }
}