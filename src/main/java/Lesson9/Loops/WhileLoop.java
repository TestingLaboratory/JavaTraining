package Lesson9.Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 0;

        while (counter != 10) {
            counter++;
            System.out.println(counter);
        }
        System.out.println();
        while (counter != 0) {
            counter--;
            System.out.println(counter);
        }
    }

    //todo write some bomb system with count from 100 and booms everytime when it reach full ten for eg 70, 60, etc.
}
