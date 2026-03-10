// You are given a positive integer n. Each digit of n has a sign according to the following rules:
// The most significant digit is assigned a positive sign.
// Each other digit has an opposite sign to its adjacent digits.
// Return the sum of all digits with their corresponding sign.

// Example 1:
// Input: n = 521
// Output: 4
// Explanation: (+5) + (-2) + (+1) = 4.
// Example 2:
// Input: n = 111
// Output: 1
// Explanation: (+1) + (-1) + (+1) = 1.
// Example 3:
// Input: n = 886996
// Output: 0
// Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
// class Solution {
//     public int alternateDigitSum(int n) {
//         int sum = 0;
//         int dummy = n;
//         int count = 0;
//         while(n!=0){
//             count++;
//             n=n/10;
//         }
//         while(dummy!=0){
//             int rem = dummy % 10;
//             if(count % 2 == 0){
//                 sum = sum - rem;
//                 count--;
//             } 
//             else{
//                 sum = sum + rem;
//                 count--;
//             }
//             dummy = dummy/10;
//         }
//         return sum;
//     }
// }
import java.util.Scanner;

class Leetcode2544 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int dummy = n;
        int count = 0;
        while (dummy != 0) {
            int rem = dummy % 10;
            if (count % 2 == 0) {
                sum = sum - rem;
                count--;
            } else {
                sum = sum + rem;
                count--;
            }
            dummy = dummy / 10;
        }
        System.out.println(sum);
    }
}
