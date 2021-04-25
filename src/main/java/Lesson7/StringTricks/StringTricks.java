package Lesson7.StringTricks;

public class StringTricks {

    public static void main(String[] args) {
        String sampleString = "Sample tests Strings";
        System.out.println(sampleString.equals("Sample"));
        System.out.println(sampleString.contains("tests"));


        System.out.println(  sampleString.toLowerCase());

        System.out.println(sampleString.toUpperCase());

        System.out.println(sampleString.equals("SaMPle TeStS StriNg"));

        System.out.println(sampleString.compareToIgnoreCase("SaMPle TeStS StriNg"));

        //TODO discover more fancy methods on string and use IT

    }
}
