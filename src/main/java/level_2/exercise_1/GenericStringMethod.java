package level_2.exercise_1;

public class GenericStringMethod {

    public static <T1, T2> void printArguments(T1 firstArgument, T2 secondArgument,
                                               String thirdArgument) {
        System.out.printf("%s%n%s%n%s%n%n", firstArgument, secondArgument, thirdArgument);
    }
}
