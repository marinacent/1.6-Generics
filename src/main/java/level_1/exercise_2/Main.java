package level_1.exercise_2;

public class Main {

    public static void main(String[] args) {
        Person personExample = new Person("Sophia", "Garcia", 45);
        String stringExample = "1.6-Generics";
        int intExample = 2025;
        double doubleExample = 4.5;
        char charExample = 'c';


        GenericMethods.printArguments(personExample, stringExample, intExample);
        GenericMethods.printArguments(stringExample, doubleExample, personExample);
        GenericMethods.printArguments(intExample, charExample, doubleExample);
    }
}
