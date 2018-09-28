import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        int testing;
        String question;

        //initialization phase
        keyboard = new Scanner(System.in);
        System.out.println("whats your question");
        question = keyboard.nextLine();
        System.out.println("put in a random number between 1-100");
        testing = keyboard.nextInt();
        if ((1 <= testing) && (testing <= 10)) {
            System.out.println("your outlook looks good");
        }

        if ((11 <= testing) && (testing <= 20)) {
                System.out.println("it is certain");
        }
        if ((21 <= testing) && (testing <= 30)) {
                System.out.println("it will pass");
        }
        if ((31 <= testing) && (testing <= 40)) {
            System.out.println("don't count on it");
        }
        if ((41 <= testing) && (testing <= 50)) {
                System.out.println("ask again");
        }
        if ((51 <= testing) && (testing <= -60)) {
                System.out.println("absolutely");
        }
        if ((61 <= testing) && (testing <= -70)) {
                System.out.println("no doubt");
        }
        if ((71 <= testing) && (testing <= -80)) {
                System.out.println("cannot tell now");
        }
        if ((81 <= testing) && (testing <= -90)) {
                System.out.println("Go for it");
        }
        if ((91 <= testing) && (testing <= -100)) {
            System.out.println("May be");
        }




                }
            }
