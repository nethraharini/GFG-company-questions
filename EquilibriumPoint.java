class Solution {
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0, leftSum = 0;

        // Step 1: Compute total sum
        for (int num : arr) {
            totalSum += num;
        }

        // Step 2: Iterate and check equilibrium condition
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i]; // Right sum dynamically

            if (leftSum == rightSum) {
                return i; // Return first equilibrium index
            }

            leftSum += arr[i]; // Update left sum for next iteration
        }
        return -1; // No equilibrium index found
    }

    
}


/*input
[1,2,0,3]
output
2*/
