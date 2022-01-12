package Fundamental;

public class ConditionImportant {

    public static void main(String[] args) {
        int i=10;
        int j;
        if (i==10){
            j=20;
        }
        //System.out.println( j);
        
        /*
        Status: No Compilation Error
Reasons:
1.In java applications, only class level variables are having default values,
local variables are not having default values.
If we declare local variables in java applications then we must provide initializations for that local variables explicitly, if we access any local
variable without having initialization explicitly then compiler will rise an error like
"Variable x might not have been initialized".
         */

        int i1=10,j1;
        if (i1==10){
            j1=200;
        }
        else {
            j1=30;
        }
        System.out.println(j1);


        final int i3=10;  //final keyword make i3 as constant and this is executed by compiler not JVM
        int j3;
        if (i3==10){
            j3=2333;
        }
        System.out.println(j3);
    }
}
