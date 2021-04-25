package Lesson6.ClasesAndMethods;

public class ClassConventions {

    public static void main(String[] args) {

    }

    /**
     * fields section
     */
    String field;
    private String otherField;
    int numberField = 10;

    /**
     * constructors
     */

    public ClassConventions() {

    }

    ClassConventions(String argument) {
        otherField = argument;
        numberField = 0;
    }

    /**
     * methods section
     */

    void printSomething() {
        System.out.println("print me");
    }

    String getField() {
        return field;
    }

    void modifyField(String value) {
        field = field + value;
    }

    int getNumber() {
        return numberField;
    }

    void incrementNumber() {
        numberField++;
    }

    String getOtherField() {
        return otherField;
    }

    void setOtherField(String value) {
        otherField = value;
    }

}
