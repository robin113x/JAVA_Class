package Fundamental;

public class Operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Increment and Decrement  (++,--)

        int c = 5;
        System.out.println(++c); //preincrement -> highest priority
        c = 5;
        System.out.println(c++); //postincrement -> least priority
        System.out.println(c);

        int d = 10;
        System.out.println(--d); //predecrement -> highest priority
        System.out.println(d--); //postdecrement -> least priority
        System.out.println(d);
        a = 5;
        System.out.println(++a + a-- * --a + --a);
        a = 6;
        System.out.println((++a + --a) * (a-- + --a) - (++a + --a) * (--a - ++a));

        //BitWise (<<  n*2^k ,>> n/2^k)
        a = 2;
        b = a << 1;
        System.out.println(b);

        //Ternary operator

        a = 10;
        b = 20;
        int min = a < b ? a : b;
        System.out.println(min);

        //Short Circuit operator (&&, ||)
            /*
            1.Diff b/w | and ||

            | -> it will check the 2nd condition if 1st condition is already
            true. it will decrease the performance

            || -> if the 1st condition is true then it will not check the
            2nd condition

            2.Diff b/w & and &&
             & -> it will check the 2nd condition if 1st condition is already
            false. it will decrease the performance

            && -> if the 1st condition is false then it will not check the
            2nd condition

            i.e why || and && is known as shortcut operator
             */
        int e = 10, f = 10;
        if (e++ == 10 | f++ == 10) {
            System.out.println(e + " " + f);
        }
        e = 10;
        f = 10;
        if (e++ == 10 || f++ == 10) {
            System.out.println(e + " " + f);
        }

        int g = 10, h = 10;
        if (g++ != 10 & h++ != 10) {
            System.out.println(g + " " + h);
        }
        g = 10;
        h = 10;
        if (g++ != 10 && h++ != 10) {
            System.out.println(g + " " + h);
        }




    }
}
