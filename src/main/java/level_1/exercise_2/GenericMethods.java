package level_1.exercise_2;

public class GenericMethods {

    public static <T1, T2, T3> void printArguments(T1 firstArgument, T2 secondArgument, T3 thirdArgument) {
        System.out.printf("%s%n%s%n%s%n%n", firstArgument, secondArgument, thirdArgument);
    }
}
