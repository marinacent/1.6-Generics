package level_2.exercise_2;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class GenericListMethod {

    public static <T> void printArguments(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
        System.out.println();
    }
}
