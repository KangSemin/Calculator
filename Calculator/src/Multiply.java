public class Multiply<T extends Number> implements Operation<T> {

    @Override
    public T operate(T a, T b) {

        if (a instanceof Integer && b instanceof Integer)
        {
            return (T)  Integer.valueOf(a.intValue() * b.intValue());
        }
        else if (a instanceof Double || b instanceof Double)
        {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        }
        throw new IllegalArgumentException("지원하지 않는 타입입니다.");

    }
}
