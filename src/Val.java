public class Val extends Funct0 {
    private double value;

    public Val(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Function getDiff(Var x) {
        return new Val(0.0);
    }

    public String toString() {
        return Double.toString(value);
    }
}
