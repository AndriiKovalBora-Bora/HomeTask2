package HomeTask2;

public class View {
    public static final String INPUT_NUMBER = "Enter the number from ";
    public static final String WRONG_INPUT_NUMBER = "Wrong input! Your date is not a integer number! Please, try again";
    public static final String NUMBER_OUT_OF_BOUNDS = "Wrong input! ";
    public static final String TO = " to ";

    public static final String LESS_NUMBER = "The specified number is less than yours";
    public static final String MORE_NUMBER = "The specified number is more than yours";
    public static final String RIGHT_NUMBER = "Congratulation! You guessed the number! The number is : ";
    public static final String ENTERED_NUMBERS = "Entered numbers : ";
    public static final String PREVIOUS_INPUT = "Previous input was : ";

    public void printMessage(String message) {
        System.out.println(message);
    }

}
