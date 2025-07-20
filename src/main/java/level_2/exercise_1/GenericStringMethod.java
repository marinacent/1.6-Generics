package level_2.exercise_1;

public class GenericStringMethod {

    public static <T> void printArguments(T firstArgument, T secondArgument, String thirdArgument) {
        System.out.printf("%s%n%s%n%s%n%n", firstArgument, secondArgument, thirdArgument);
    }
}
