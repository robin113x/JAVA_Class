package Pattern;

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j=0;j<n-5;j++){
                System.out.print(" ");
            }
            for (int k = 0; k < n-5; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
