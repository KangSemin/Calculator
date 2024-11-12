import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator<T extends Number> {

    private List<Number> results;



    public Calculator() {
        results = new ArrayList<>();
    }

    public  <T extends Number> Operation<T> getOperation(OperatorType op)
    {

        switch (op) {
            case ADD:
                return new Addiction<T>();
            case SUBTRACT:
                return new Subtraction<T>();
            case MULTIPLY:
                return new Multiply<T>();
            case DIVIDE:
                return new Devision<T>();
            default:
                throw new UnsupportedOperationException("Unsupported operation.");
        }


    }

    public void addResults(Number d)
    {
        results.add(d);
    }

    public List<Number> getResults() {
        return new ArrayList<>(results);
    }



    public void deleteOldestResult() {
        if (!results.isEmpty()) {
            results.removeFirst();
        } else {
            System.out.println("No results to delete.");
        }
    }

    public List<Number> getGreater(Number n) {
        return results.stream()
                .filter(r -> n.doubleValue() < r.doubleValue())
                .collect(Collectors.toList());
    }
}
