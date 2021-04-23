package Lesson9.Loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ForEachLoop {

    public static void main(String[] args) {
        List<String> personLists = new ArrayList<>();
        personLists.add("Josh");
        personLists.add("Anna");
        personLists.add("Milfred");


        for (String person : personLists) {
            System.out.println(person);
        }
    }


    //todo try to copy to other list only those person who name have 4 leters.
}
