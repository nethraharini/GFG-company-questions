class Solution {
    int missingNumber(int arr[]) {
        // code here
        int xor1 =0, xor2 = 0;
        int maxnum = arr.length+1;
        for(int i=1;i<=maxnum;i++){
            xor1^= i;                    //it performs xor operations with iteration
        }
            
        for(int num : arr){
                xor2^= num;                //it performs xor with arr
            }
            
            return xor1 ^ xor2;    // it performs with iteration result ^ and arr result
            
        }
        
    }

/*
input
  arr [ 1,2,3,5]
  ouput
  4
  */
