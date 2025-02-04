class Solution {
    public int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int num : arr) {
            currSum += num;
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sol.maxSubArraySum(arr));  // Output: 6
    }
}



class Solution:
    def maxSubArraySum(self, arr):
        maxSum = float('-inf')  # Store the max sum found so far
        currSum = 0             # Store the current subarray sum

        for num in arr:
            currSum += num
            maxSum = max(maxSum, currSum)

            # Reset if current sum becomes negative
            if currSum < 0:
                currSum = 0

        return maxSum

# Example usage
sol = Solution()
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
print(sol.maxSubArraySum(arr))  # Output: 6



/*input
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output:
6*/
