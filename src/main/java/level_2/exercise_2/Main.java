package level_2.exercise_2;

import level_1.exercise_2.GenericMethods;
import level_1.exercise_2.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person sophia = new Person("Sophia", "Garcia", 45);
        Person joan = new Person("Joan", "Pastor", 55);

        GenericListMethod.printArguments(sophia, joan);
        GenericListMethod.printArguments(1, 2, 3, 4, 5);
        GenericListMethod.printArguments("one string", "two strings", "three strings");
        GenericListMethod.printArguments('a');
        GenericListMethod.printArguments(1.4, 2.3, 8.2);

    }
}
