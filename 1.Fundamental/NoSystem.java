package Fundamental;

public class NoSystem {
    public static void main(String[] args) {
        /*
        1. Binary Number Systems[BASE-2]
        2. Octal Number Systems[BASE-8]
        3. Decimal Number Systems[BASE-10] -> Default in java
        4. Hexa Decimal Number System [BASE-16]
         */

        //Binary no -> 0B or 0b
        int a=0b101;
        int b=0B10101;
        System.out.println(a+" "+b);

        //Octal Number Systems[BASE-8] -> prefix 0 [0-7]
        int c = 0123;
        int d=06543;
        System.out.println(c+" "+d);

        //Decimal Number Systems -> no prefix [0-9]
        int e=856321;
        int f=654;
        System.out.println(e+" "+f);

        //Hexa Decimal Number Systems -> prefix 0x or 0X [0-9a-f]
        int g=0x654a;
        int h=0x654f;
        System.out.println(g+" "+h);

        int sum = a+b+c+d+e+f+g+h;
        System.out.println(sum);
    }
}
