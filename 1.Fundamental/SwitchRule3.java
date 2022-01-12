package Fundamental;

public class SwitchRule3 {
    public static void main(String[] args) {
        int a=10;
        switch (a){
            case 1:  // break statements are optional
                System.out.println(1);
            case 5:
                System.out.println(5);
            case 10:
                System.out.println(10);

            default:
                System.out.println("sorry");
        }

      /*
      int i=5,j=10,k=15,l=20;
        switch (10){
        case i:   case value must be constant  final
                System.out.println(1);
                 break;
            case j:
                System.out.println(5);
                 break;
            case k:
                System.out.println(10);
                 break;
            case l:
                System.out.println(10);
                 break;
            default:
                System.out.println("sorry");
                 break;

        }
       */

        final int i=5,j=10,k=15,l=20;
        switch (10){
            case i:   //case value must be constant or final
                System.out.println(1);
                break;
            case j:
                System.out.println(5);
                break;
            case k:
                System.out.println(10);
                break;
            case l:
                System.out.println(20);
                break;
            default:
                System.out.println("sorry");
                break;
        }

        //--------------------------------------------------

        byte a1=125;
        switch (a1){
            case 125:
                System.out.println(1);
                break;
            case 126:
                System.out.println(5);
                break;
            case 128: //Error
                // case value must be within the range of data type
                System.out.println(10);
                break;
            default:
                System.out.println("sorry");
        }

    }
}
