package level_1.exercise_2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Sophia", "Garcia", 45);
        String task = "1.6-Generics";
        int year = 2025;

        GenericMethods.printArguments(person, task, year);
    }
}
