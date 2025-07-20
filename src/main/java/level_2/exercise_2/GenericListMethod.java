package level_2.exercise_2;

import java.util.List;

public class GenericListMethod {

    public static <T> void printArguments(List<T> argList) {
        for (T arg : argList) {
            System.out.println(arg);
        }
        System.out.println();
    }
}
