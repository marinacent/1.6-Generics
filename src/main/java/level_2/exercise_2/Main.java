package level_2.exercise_2;

import level_1.exercise_2.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one string", "two strings", "three strings");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sophia", "Garcia", 45));
        personList.add(new Person("Joan", "Pastor", 55));

        GenericListMethod.printArguments(stringList);
        GenericListMethod.printArguments(integerList);
        GenericListMethod.printArguments(personList);

    }
}
