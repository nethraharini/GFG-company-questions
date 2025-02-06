class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        return arr[k-1];  // k = 3 -1 is index of sorted array  is 7
    }
}

/*
input
  [7,10,4,3,20,15]
output
  7*/
