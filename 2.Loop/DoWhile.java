package Loop;
/*
 while loop
    -> Entry control loop
    -> if condition is false then loop will not run

    while(condition){
    }

 do while loop
    -> Exit control loop
    -> if condition is false then loop will at least one time

    do{
    }while(condition);
 */

public class DoWhile {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while (i<11);
    }
}
