package Fundamental;

public class SwitchRule {
    public static void main(String[] args) {
        byte b = 5;
        switch (b){  //Only short byte int char  String allowed as a parameter
            // long double float  boolean are not allowed
            case 1:
                System.out.println("hii");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 5:
                System.out.println("Hi Hello");
                break;
            default:
                System.out.println("Sorry");
                break;
        }
    }
}
