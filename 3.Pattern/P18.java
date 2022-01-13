package Pattern;

import java.util.Scanner;

public class P18 {
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
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print(" ");
            }
            for (int l = 0; l < n-k; l++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
