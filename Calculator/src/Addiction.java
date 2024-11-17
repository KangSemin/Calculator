public class Addiction<T extends Number> implements Operation<T>
{

    @Override
    public T operate(T a, T b) {

        return (T) new Parse().parse(a.doubleValue() + b.doubleValue());

    }
}


