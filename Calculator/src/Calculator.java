import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator<T extends Number> {

    private List<Double> results;

    public Calculator() {
        results = new ArrayList<>();
    }

    public  <T extends Number> Operation<T> getOperation(OperatorType op)
    {


        double r;

        switch (op) {
            case ADD:
                return new Addiction<T>();
            case SUBTRACT:
                return new Subtraction<T>();
            case MULTIPLY:

                break;
            case DIVIDE:

                break;
            default:
                throw new UnsupportedOperationException("Unsupported operation.");
        }


        return new Addiction<T>();
    }


    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    public void deleteOldestResult() {
        if (!results.isEmpty()) {
            results.removeFirst();
        } else {
            System.out.println("No results to delete.");
        }
    }

    public List<Double> getGreater(double n) {
        return results.stream()
                .filter(r -> r > n)
                .collect(Collectors.toList());
    }
}
