
// Given an integer num, return the number of digits in num that divide num.
// An integer val divides nums if nums % val == 0.
// Example 1:
// Input: num = 7
// Output: 1
// Explanation: 7 divides itself, hence the answer is 1.
// Example 2:
// Input: num = 121
// Output: 2
// Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
// Example 3:
// Input: num = 1248
// Output: 4
// Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
// class Solution {
//     public int countDigits(int num) {
//         int count = 0;
//         int n = num;
//         while(num!=0){
//             int dig = num%10;
//             if(n % dig == 0){
//                 count++;
//             }
//             num = num/10;
//         }
//         return count;
//     }
// }
import java.util.Scanner;

class Leetcode2520 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = n;
        while (n != 0) {
            int dig = n % 10;
            if (num % dig == 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
