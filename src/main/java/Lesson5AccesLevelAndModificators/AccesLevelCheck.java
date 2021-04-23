package Lesson5AccesLevelAndModificators;

public class AccesLevelCheck {

    static AccessLevels accessLevels = new AccessLevels();

    public static void main(String[] args) {
        example();
    }

    public static void example() {
        System.out.println(accessLevels.numberOne);

        System.out.println(accessLevels.numberThree);

        System.out.println(accessLevels.numberFour);

        System.out.println(accessLevels.numberSix);

        System.out.println(AccessLevels.numberFive);


//TODO try to increase each variable
    }


}
