package level_2.exercise_1;

import level_1.exercise_2.Person;

public class Main {
    public static void main(String[] args) {
        Person personExample = new Person("Sophia", "Garcia", 45);
        String stringExample = "1.6-Generics";
        String anotherString = "level-2";
        int intExample = 2025;
        double doubleExample = 4.5;
        char charExample = 'c';

        GenericStringMethod.printArguments(personExample, intExample, stringExample);
        GenericStringMethod.printArguments(anotherString, doubleExample, stringExample);
        GenericStringMethod.printArguments(charExample, personExample, anotherString);

    }
}
