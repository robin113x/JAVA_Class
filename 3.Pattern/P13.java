package Pattern;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}
