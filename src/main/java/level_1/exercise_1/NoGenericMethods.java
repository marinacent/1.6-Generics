package level_1.exercise_1;

public class NoGenericMethods {
    private String firstArgument;
    private String secondArgument;
    private String thirdArgument;

    public NoGenericMethods(String firstArgument, String secondArgument, String thirdArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        this.thirdArgument = thirdArgument;
    }


    public String getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(String firstArgument) {
        this.firstArgument = firstArgument;
    }

    public String getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(String secondArgument) {
        this.secondArgument = secondArgument;
    }

    public String getThirdArgument() {
        return thirdArgument;
    }

    public void setThirdArgument(String thirdArgument) {
        this.thirdArgument = thirdArgument;
    }
}
