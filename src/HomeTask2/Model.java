package HomeTask2;

import java.util.ArrayDeque;

public class Model {
    private int specifiedNumber;
    private int lowerBound;
    private int upperBound;
    private int userNumber;
    private ArrayDeque<Integer> enteredNumbers;
    private String previousInput;

    public Model() {
        lowerBound = Constants.NUMBER_MIN;
        upperBound = Constants.NUMBER_MAX;
        specifiedNumber = rand(lowerBound, upperBound);
        enteredNumbers = new ArrayDeque<>();
    }

    private int rand(int min, int max) {
        return min + (int) (Math.random() * (max + 1 - min));
    }

    private int rand() {
        return Constants.RAND_MIN + (int) (Math.random() * (Constants.RAND_MAX + 1 - Constants.RAND_MIN));
    }

    public int checkNumber(int userNumber) {
        setUserNumber(userNumber);
        enteredNumbers.addLast(userNumber);

        if (specifiedNumber < userNumber) {
            upperBound = userNumber - 1;
            return -1;
        } else if (specifiedNumber > userNumber) {
            lowerBound = userNumber + 1;
            return 1;
        }
        return 0;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public ArrayDeque<Integer> getEnteredNumbers() {
        return enteredNumbers;
    }

    public void setPreviousInput(String previousInput) {
        this.previousInput = previousInput;
    }

    public String getPreviousInput() {
        return previousInput;
    }

    public int callRand(int min, int max){
        return rand(min, max);
    }

    public void setSpecifiedNumber(int specifiedNumber) {
        this.specifiedNumber = specifiedNumber;
    }

    public int getSpecifiedNumber() {
        return specifiedNumber;
    }
}
