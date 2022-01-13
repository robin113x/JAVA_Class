package Pattern;

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
