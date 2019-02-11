package HomeTask2;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        int checked;
        do {
            view.printMessage(View.ENTERED_NUMBERS + model.getEnteredNumbers().toString());
            checked = model.checkNumber(inputUserNumber(sc, model.getLowerBound(), model.getUpperBound()));
            switch (checked) {
                case -1:
                    view.printMessage(View.LESS_NUMBER);
                    break;
                case 1:
                    view.printMessage(View.MORE_NUMBER);
                    break;
                case 0:
                    view.printMessage(View.RIGHT_NUMBER + model.getUserNumber());
                    view.printMessage(View.ENTERED_NUMBERS + model.getEnteredNumbers().toString());
            }
        } while (checked != 0);

    }

    private int inputUserNumber(Scanner sc, int lowerBound, int upperBound) {
        view.printMessage(View.INPUT_NUMBER + lowerBound + View.TO + upperBound);
        int number = inputNumber(sc);
        model.setPreviousInput(Integer.toString(number));
        view.printMessage(View.PREVIOUS_INPUT + model.getPreviousInput());
        while ((number < lowerBound) || (number > upperBound)) {
            view.printMessage(View.NUMBER_OUT_OF_BOUNDS + View.INPUT_NUMBER + lowerBound + View.TO + upperBound);
            number = inputNumber(sc);
            model.setPreviousInput(Integer.toString(number));
            view.printMessage(View.PREVIOUS_INPUT + model.getPreviousInput());
        }
        return number;
    }

    private int inputNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_NUMBER);
            model.setPreviousInput(sc.next());
            view.printMessage(View.PREVIOUS_INPUT + model.getPreviousInput());
        }
        return sc.nextInt();
    }
}
