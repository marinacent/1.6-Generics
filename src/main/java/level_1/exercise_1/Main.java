package level_1.exercise_1;

public class Main {

    public static void main(String[] args) {
        String ARGUMENT_A = "a";
        String ARGUMENT_B = "b";
        String ARGUMENT_C = "c";

        System.out.println(new NoGenericMethods(ARGUMENT_A, ARGUMENT_B, ARGUMENT_C));
        System.out.println(new NoGenericMethods(ARGUMENT_B, ARGUMENT_C, ARGUMENT_A));
        System.out.println(new NoGenericMethods(ARGUMENT_C, ARGUMENT_A, ARGUMENT_B));
    }
}
