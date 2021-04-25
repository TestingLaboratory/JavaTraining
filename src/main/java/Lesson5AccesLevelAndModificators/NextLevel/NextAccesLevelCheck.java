package Lesson5AccesLevelAndModificators.NextLevel;

import Lesson5AccesLevelAndModificators.AccessLevels;

public class NextAccesLevelCheck {

    static NextAccessLevels nextAccessLevels = new NextAccessLevels();

    static AccessLevels accessLevels = new AccessLevels();

    public static void main(String[] args) {
        example();
    }

    public static void example() {
        System.out.println(nextAccessLevels.nextNumberOne);

        System.out.println(nextAccessLevels.nextNumberThree);

        System.out.println(nextAccessLevels.nextNumberFour);

        System.out.println(nextAccessLevels.nextNumberSix);

        System.out.println(NextAccessLevels.nextNumberFive);

        nextAccessLevels.nextNumberOne = 11;
        ++nextAccessLevels.nextNumberThree;

        System.out.println(nextAccessLevels.nextNumberOne);
        System.out.println(nextAccessLevels.nextNumberThree);

        System.out.println(accessLevels.numberThree);


    }


}
