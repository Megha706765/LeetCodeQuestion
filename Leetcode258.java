
// class Solution {
//     public int addDigits(int num) {
//         while (num >= 10) {
//             int sum = 0;
//             while (num != 0) {
//                 int rem = num % 10;
//                 sum = sum + rem;
//                 num = num / 10;
//             }
//             num = sum;
//         }
//         return num;
//     }
// }
import java.util.Scanner;

class Leetcode258 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 10) {
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
