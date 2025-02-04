//bruteforce method
class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            int nextGreater = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                  nextGreater = arr[j];
                  break;
                }
            }
            result.add(nextGreater);
        }
        return result;
    }
}

//optimized stack method
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller elements from stack
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                result.add(0, -1);
            } else {
                result.add(0, stack.peek());
            }

            // Push current element onto stack
            stack.push(arr[i]);
        }

        return result;
    }


  /*arr = {4, 5, 2, 10, 8}
   Output: [5, 10, 10, -1, -1]
  */
  

