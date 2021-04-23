package Lesson8.Colections;

public class ColectonsTables {
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
        System.out.println(myOtherTable[5]);
        myOtherTable[5] = 1234;
        System.out.println(myOtherTable[5]);

        System.out.println(table[0]);


        int[][] twoDimensionsTable = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(twoDimensionsTable[1][2]);
        String[][][] threeDimensionsTable = {{{}, {}}, {{}, {}, {}}, {{}}, {{},
                {"this is maadnes!"}}, {{}, {}}, {{}, {}, {}}, {{}}, {{}, {}}, {{}}};

        //todo declare yours own table of double. With 5 elements. Fill first value and displayIt. Fill and display lastOne

        //todo For EXPERTS display go to madnes
    }
}
