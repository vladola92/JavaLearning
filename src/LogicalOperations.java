import java.util.Scanner;

public class LogicalOperations {


    public void switchCaseMethod() {

        Scanner scan = new Scanner(System.in);
        System.out.println("type a number");
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("no here");
                break;
        }
    }
    public void checkNumber(){
        int x = 5;
        int y = 7;

        if (x > y) {
            System.out.println("X mai mare decat y");
        } else if (x < y) {
            System.out.println("x mai mci decat y ");
        } else if (x == y) {
            System.out.println(" x egal cu y");
        }
    }
}
