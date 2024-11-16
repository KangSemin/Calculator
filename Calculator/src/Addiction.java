public class Addiction<T extends Number> implements Operation<T>
{

    @Override
    public T operate(T a, T b) {

        Parse parse = new Parse();
        return (T) parse.parse(a.doubleValue() + b.doubleValue());

    }
}


