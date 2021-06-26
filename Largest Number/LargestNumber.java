/*
Given a list of non-negative integers nums, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
Example 3:

Input: nums = [1]
Output: "1"
Example 4:

Input: nums = [10]
Output: "10"
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109

*/
class Solution {
    public String largestNumber(int[] nums) {
            int size = nums.length;
            String[] arr = new String[size];
            
            for(int i=0;i<size;i++){
                arr[i] = String.valueOf(nums[i]);
            }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
             
           StringBuilder sb = new StringBuilder();
           
        for(String str:arr){
            sb = sb.append(str);
        }
        String result = sb.toString();
        if(result.startsWith("0")){
            return "0";
        }
        return result;
        }
}