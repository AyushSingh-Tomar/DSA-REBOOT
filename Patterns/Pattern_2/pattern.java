package Patterns.Pattern_2;

class Solution {
    public void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
