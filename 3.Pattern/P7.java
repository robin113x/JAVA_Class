package Pattern;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char)(64+n-j)+" ");
            }
            System.out.println();
        }
    }
}
