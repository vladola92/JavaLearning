import java.util.Scanner;

public class LogicalOperations {


    public void ex1() {

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

    public void ex2() {
        int x = 5;
        int y = 7;

        if (x > y) {
            System.out.println("X mai mare decat y");
        } else if (x < y) {
            System.out.println("x mai mic decat y ");
        } else if (x == y) {
            System.out.println(" x egal cu y");
        }
    }

    //Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the
    //number
    public void ex3() {
        int x = 7;
        if (x >= 2 && x <= 8) {
            System.out.println(x);
        } else {
            System.out.println("x is not equal to or higher than 2 and equal to or lower than 8 ");
        }
    }

    //Given a text input and a number input, if the text is equal to “QA” AND the
    //number is equal to or lower than 3, print the text and the number. If the text is not
    //“QA” AND the number is equal to or higher than 4, print the number and the
    //text, in this order.

    public void ex4() {
        String x = "QA";
        int y = 2;
        if (x.equals("QA") && y <= 3) {
            System.out.println("ce vrei tu");
        } else {
            System.out.println("adgdfjgio");


        }
    }
    //Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow
    //this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”

    public void ex5() {
        int x = 3;
        if (x > 8 || x == 6) {
            System.out.println("The amount of snow this winter was " + x);
        } else {
            System.out.println("The forcast snow is " + x);
        }
    }

    //Given a number input, if the number is greater than 3 but not equal to 4, print “The
    //number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print
    //”The number is equal to 4”. Else if the number is lower than 3 print “The number is
    //lower than 3”

    public void ex6() {
        int x = 4;
        if (x > 3 && x != 4) {
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (x == 4) {
            System.out.println("The number is equal to 4");
        } else if (x < 3) {
            System.out.println("The number lower than 3");
        }
    }
}
