package Loop;

public class Loop1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " . Core Java");
        }
        /*
        int i=0    -> one time
        i<10       -> 11 time
        i++        ->10 time
        Body       -> 10 time
         */
        System.out.printf("----------------------------------------------- ");
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i + " . Core Java");
        }
        System.out.printf("----------------------------------------------- ");

        int j = 0;
        for (System.out.println("hello"); j < 10; j++) {
            System.out.println(j);
        }

//        for (int k = 0, float f = 0.0f;k< 10 &&f < 10.0f;k++, f++)
//        { more than one declaration in expression 1  is not possible
//            System.out.println(k + " " + f);
//        }

        for (int k = 0, m = 0; k < 10 && m < 10; k++, m++) {
            //initialization more than one value in single declaration is valid
            System.out.println(k + " " + m);
        }
        System.out.printf("----------------------------------------------- ");

        /*
        for (int i1=0;;i1++){  -> infinite loop  expression 2 is optional
             We can use loop without expression 2 but  if we want to
             provide expression 2 , then expression 2 must be conditional statement only
            System.out.println(i1);
        }

         */


        System.out.println("************************");
/*
        for (int a=0;true;a++){
            System.out.println(a);
        }
        System.out.println("hiii");

 */
        for (int k = 0; k < 10; System.out.println("Hello")) {
            System.out.println(k);
            k+=1;
        }
    }
}
