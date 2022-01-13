package Pattern;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++)
                System.out.print((n-j)+" ");
            System.out.println();
        }

    }
}
