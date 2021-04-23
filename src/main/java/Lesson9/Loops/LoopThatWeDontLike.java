package Lesson9.Loops;

import java.util.ArrayList;
import java.util.List;

public class LoopThatWeDontLike {
    public static void main(String[] args) {

        int i = 0;
        do {
            i++;
            System.out.println("iteration of do while" + i);

        }
        while (i < 20);


        List<Integer> sampleList = new ArrayList<>();

        do {
            sampleList.add(1);
            System.out.println("adding to lists");
        } while (sampleList.get(0) < 10);

        //todo find some practise use to do while list.
    }
}
