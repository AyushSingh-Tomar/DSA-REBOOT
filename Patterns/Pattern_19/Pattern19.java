// class Solution {
//     public void pattern19(int n) {
//         for(int i=0;i<n;i++){
//             for(int j=0;j<(n-i);j++)
//             {
//                 System.out.print("*");
//             }
//             for(int j=0;j<(2*i);j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<(n-i);j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             for(int j=2*(n-i)-2;j>0;j--)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }