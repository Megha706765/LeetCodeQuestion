//509. Fibonacci Number

// class Solution {
//     public int fib(int n) {
//         if(n == 0 || n == 1) return n;  //base case
//         int a = 0;
//         int b = 1; 
//         int sum = 0;
//         for(int i=2; i<=n; i++){
//             sum = a+b;
//             a=b;
//             b=sum;
//         }
//         return sum;
//         }
//     }
//
//
//
import java.util.Scanner;

class Leetcode509 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
    }
}
