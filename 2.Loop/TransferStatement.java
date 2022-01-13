package Loop;
/*
    Transfer statements
        break
            -> break with label
        continue
            -> continue with label
        return
 */
public class TransferStatement {
    public static void main(String[] args) {

        for (int i=0;i<20;i++){
            if (i==5)
                break;
            System.out.println(i);
        }
        System.out.println("Break is executed");

        System.out.println("---------------------------------------------------");

        l1:for (int i=0;i<10;i++){
            for (int j = 0; j < 10; j++) {
                if (i==5)
                    break l1;
                System.out.println(i+"  "+j);
            }
        }
        
        System.out.println("---------------------------------------------------");


        for (int i = 0; i < 20; i++) {
            if (i>=10 && i<=15)
                continue;
            System.out.println(i);
        }
        System.out.println("After Continue");
    }
}
