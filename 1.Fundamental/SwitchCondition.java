package Fundamental;

public class SwitchCondition {
    public static void main(String[] args) {
        /*
        use of switch :
            Application where mean is needed
            1. Add
            2. Sub
            3. Mul
            4. Div

            -------------Syntax----------------

            switch(var){
            case1:
                //body
                break;
             case2:
                //body
                break;
             case3:
                //body
                break;
             default:
                  //body
                  break;
            }
         */

        int i=10;
        switch (i){
            case 20:
                System.out.println(20);
                break;
            case 15:
                System.out.println(15);
                break;
            case 10:
                System.out.println(10);
                break;
            case 5:
                System.out.println(5);
                break;
            default:
                System.out.println("no matching");
                break;
        }
    }
}
