public class Main {

    public static void main(String[] args){
        String ARGUMENT_A = "a";
        String ARGUMENT_B = "b";
        String ARGUMENT_C = "c";

        NoGenericMethods aFirst = new NoGenericMethods(ARGUMENT_A, ARGUMENT_B, ARGUMENT_C);
        NoGenericMethods bFirst = new NoGenericMethods(ARGUMENT_B, ARGUMENT_C, ARGUMENT_A);
        NoGenericMethods cFirst = new NoGenericMethods(ARGUMENT_C, ARGUMENT_A, ARGUMENT_B);
    }
}
