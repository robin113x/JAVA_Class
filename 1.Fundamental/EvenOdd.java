package Fundamental;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();

        if(a%2==0){
            System.out.println("Even no");
        }
        else{
            System.out.println(a+"Odd no");
        }
    }
}
