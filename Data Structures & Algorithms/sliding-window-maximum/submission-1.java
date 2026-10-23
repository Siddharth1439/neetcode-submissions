

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];

        for (int right = 0; right < n; right++) {

            // 1. Remove indices outside the window
            while (!dq.isEmpty() &&
                   dq.peekFirst() <= right - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller values from the back
            while (!dq.isEmpty() &&
                   nums[dq.peekLast()] <= nums[right]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(right);

            // 4. Store the maximum
            if (right >= k - 1) {
                res[right - k + 1] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}
