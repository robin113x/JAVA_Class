package Fundamental;

public class SwitchRule2 {
    public static void main(String[] args) {
        int a=10;
        // In Switch cases are optional and Default is also optional
        switch (a){
            default :
                System.out.println("Hii");
                break;
        }
        switch (a){
            case 5:
                System.out.println(50);
                break;
            case 10:
                System.out.println(10);
                break;
        }

        switch (a){
            //Valid syntax because both cases and default are optional
            //but useless
        }
    }
}
