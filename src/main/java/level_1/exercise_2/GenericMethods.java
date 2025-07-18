package level_1.exercise_2;

public class GenericMethods {

    public static <T> void printArguments(T firstArgument, T secondArgument, T thirdArgument) {
        System.out.printf("%s%n%s%n%s%n", firstArgument, secondArgument, thirdArgument);
    }
}
