public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType getSymbol(char symbol) {
        for (OperatorType op : values()) {
            if (op.symbol == symbol) {
                return op;
            }
        }
        throw new IllegalArgumentException("Invalid operator: " + symbol);
    }
}
