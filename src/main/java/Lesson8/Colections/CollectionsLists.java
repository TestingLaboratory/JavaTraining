package Lesson8.Colections;

import Lesson5AccesLevelAndModificators.AccessLevels;

import java.util.ArrayList;
import java.util.List;

public class CollectionsLists {

    public static void main(String[] args) {
        List<String> listsOfTexts = new ArrayList<>();

        listsOfTexts.add("xxx");
        System.out.println(listsOfTexts.size());
        System.out.println(listsOfTexts.get(0));
        System.out.println(listsOfTexts.indexOf("xxx"));
        listsOfTexts.remove("xxx");

        List<Double> doubles = List.of(1.0, 2.0);

//        doubles.remove(1);
//        doubles.remove(2.0);

        System.out.println(doubles.get(0));

//        doubles.add(5.0);

        List<AccessLevels> superKolekcja = new ArrayList<>();
        List<List<String>> superKolekcjaDwaWymiary;


        //todo create your own list and fill it wit sample data
        //todo OPTIONAL create lists with other list in in it. And Fill it;
    }
}
