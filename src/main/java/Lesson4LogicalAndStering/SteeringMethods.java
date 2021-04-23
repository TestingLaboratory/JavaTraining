package Lesson4LogicalAndStering;

import java.util.Scanner;

public class SteeringMethods {
    public static void main(String[] args) {
        int firstNumberFromUser;

        Scanner scanner = new Scanner(System.in);

        System.out.println("type some number   ");
        firstNumberFromUser = scanner.nextInt();

        if (firstNumberFromUser == 1) {
            System.out.println("you Type ONE");
        }

        if (firstNumberFromUser > 1) {
            System.out.println("you first number is bigger than ONE");
        }

        if (firstNumberFromUser > 0 && firstNumberFromUser < 100) {
            System.out.println("your number is bigger than 0 and smaller than 100");
        }

        if (firstNumberFromUser < 10 || firstNumberFromUser == 100) {
            System.out.println("your number is smaller than 10 or it is 100");
        }

        if (firstNumberFromUser < 0) {
            System.out.println("you number is smaller than 0");
        } else {
            System.out.println("you number must be bigger than 0");
        }

        switch (firstNumberFromUser) {
            case 5:
                System.out.println("you typed 5");
                break;
            case 6:
                System.out.println("you typed 6");
                break;
            case 7:
                System.out.println("you typed 7");
                break;
            case 1:
                System.out.println("I dont like 1 so I cant break it");

            default:
                System.out.println("i do not know what to do now ");
        }

    }

}
