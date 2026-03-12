// Seven different symbols represent Roman numerals with the following values:

// Symbol	Value
// I	1
// V	5
// X	10
// L	50
// C	100
// D	500
// M	1000

// Example 1:
// Input: num = 3749
// Output: "MMMDCCXLIX"

// Explanation:
// 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
//  700 = DCC as 500 (D) + 100 (C) + 100 (C)
//   40 = XL as 10 (X) less of 50 (L)
//    9 = IX as 1 (I) less of 10 (X)
// Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places

// Example 2:
// Input: num = 58
// Output: "LVIII"

// Explanation:
// 50 = L
//  8 = VIII

// Example 3:
// Input: num = 1994
// Output: "MCMXCIV"

// Explanation:
// 1000 = M
//  900 = CM
//   90 = XC
//    4 = IV

// class Solution {
//     public String intToRoman(int num) {
//         int [] value = {
//             1000, 900, 500, 400,
//             100,  90,  50,  40,
//             10 ,  9,    5 ,  4, 1 
//         };
//         String[] symbol  = {
//             "M","CM","D","CD",
//             "C","XC","L","XL",
//             "X","IX","V","IV","I"
//         };
//         StringBuilder result = new StringBuilder();
//         for(int i=0; i<value.length; i++){
//             while(num >= value[i]){
//                 result.append(symbol[i]);
//                 num = num - value[i];
//             }
//         }
//         return result.toString();
//     }
// }
