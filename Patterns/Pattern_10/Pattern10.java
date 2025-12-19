// class Solution {
//     public void pattern12(int n) {
//         StringBuilder sb = new StringBuilder();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 sb.append(j);
//             }
//             for(int j=0;j<((n*2)-(i*2));j++){
//                 sb.append(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 sb.append(j);
//             }
//             sb.append("\n");
//         }
//         System.out.print(sb);
//     }
// }