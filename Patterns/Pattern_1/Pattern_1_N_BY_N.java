package Patterns.Pattern_1;
import java.util.Scanner;
public class Pattern_1_N_BY_N {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
