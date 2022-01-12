package Fundamental;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Implicit Type Casting:
               1          2          4       8       4           8
            byte ---> short ---> int ---> long ---> float ---> double
                       ^
                       |
                      char
         */

        short a = 10;
        int i = a;
        System.out.println(i + " " + a);

        int j = 20;
        //short b=j; incompatible types  : Compilation Error
        //System.out.println(b);

        /*
         Explicit Type Casting:
            converting data from higher data type to lower data type is called as
            Explicit Type Casting.
            int a=10;
            byte b = (byte)a;
            ( byte) -> Cast operator
         */

        int c=10;
        byte d = (byte)c;
        System.out.println(d+" "+c);

        long e=8521;
        byte f = (byte) e;
        System.out.println(f+" "+e);

        float f1 = 22.22f;
        long l= (long) f1;
        System.out.println(l);

        int i1 =125;
         short b1 = (byte)(i1);
         byte b2 = (byte)i1;
        System.out.println(b1+" "+i1+" "+b2);

        char c1='A';
        short s1 = (short)c1;
        System.out.println(s1+" "+c1);


        int i2 = 130;
        byte b3 = (byte)i2;
        System.out.println(b3);
        /* b = 130-127 => 3
            3-1 =2
            2-128=-126
         */

        int i4 = 140;
        byte b4 = (byte) i4;
        System.out.println(b4);
        /* b = 135-127 => 8
            8-1 =7
            7-128=-121

            b = 140-127 => 13
            13-1=12
            12-128 =-116
         */


    }
}
