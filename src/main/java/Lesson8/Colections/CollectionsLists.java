package Lesson8.Colections;

import java.util.ArrayList;
import java.util.List;

public class ColectionsLists {

    public static void main(String[] args) {
        List<String> listsOfTexts = new ArrayList<String>();

        listsOfTexts.add("xxx");
        System.out.println(listsOfTexts.size());
        System.out.println(listsOfTexts.get(0));

        List<Double> doubles = List.of(1.0, 2.0);

        doubles.remove(1);
        doubles.remove(2.0);

        System.out.println(doubles.get(0));

        doubles.add(5.0);
    }
}
