package Lesson6.ClasesAndMethods;

import java.lang.reflect.Field;

public class ClassConventions {
    /**
     * fields section
     */
    String field;
    String otherField;
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

}
