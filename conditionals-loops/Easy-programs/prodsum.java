/*
Leetcode problem - Easy
Subtract the Product and Sum of Digits of an Integer

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
*/

// Solution

class Solution {
    public int subtractProductAndSum(int n) {
        int rem, product = 1, sum = 0, result;    
        while(n != 0) {
            rem = n % 10;
            product *= rem;
            sum += rem;
            n = n / 10;
        }
        result = product - sum;
        return result;
    }
}
