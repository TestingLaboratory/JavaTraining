package Lesson8.Colections;

import java.util.Arrays;

public class CollectionsTables {
    public static void main(String[] args) {
        /**
         * tables
         * type [] name;
         * type [] name = new type [size]
         * type [] name = {element1,element2,...}
         */
        int[] myTable;
        int[] myOtherTable = new int[10];
        int[] table = {1, 2, 3, 4};

        System.out.println(table);
        System.out.println(Arrays.toString(table));
        System.out.println(myOtherTable[5]); // {0}{1}{2}{}{}
        myOtherTable[5] = 1234;
        System.out.println(myOtherTable[5]);

        System.out.println(table[0]);


        int[][] twoDimensionsTable = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(twoDimensionsTable[1][2]);
        String[][][] threeDimensionsTable = {{{}, {}}, {{}, {}, {}}, {{}}, {{},
                {"this is maadnes!"}}, {{}, {}}, {{}, {}, {}}, {{}}, {{}, {}}, {{}}};

        int[] copy = new int[10];

        copy = myOtherTable;

        System.out.println(Arrays.toString(copy));

        copy[1] = 12;
        System.out.println(Arrays.toString(myOtherTable));


        int[] neCopy = new int[10];
        neCopy = Arrays.copyOf(myOtherTable, myOtherTable.length);
        neCopy[9] = 12;
        System.out.println();
        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.toString(neCopy));
        //  System.out.println(table[-1]);
        //todo declare yours own table of double. With 5 elements. Fill first value and displayIt. Fill and display lastOne

        //todo For EXPERTS display go to madnes
    }
}
