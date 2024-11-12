import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Double> results;

    public Calculator() {
        results = new ArrayList<>();
    }

    public double calculate(double num1, char operator, double num2) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Can't divide by zero.");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator. Use +, -, *, /");
                return 0;
        }
        results.add(result);  // Store the result
        return result;
    }

    // Getter for the results list (returns a copy for encapsulation)
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    // Method to delete the oldest result
    public void deleteOldestResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        } else {
            System.out.println("No results to delete.");
        }
    }
}
