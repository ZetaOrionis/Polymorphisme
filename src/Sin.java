public class Sin extends Funct1 {

    public Sin(Function function) {
        super(function);
    }

    public double getValue() {
        return Math.sin(super.function.getValue());
    }

    public Function getDiff(Var x) {
        return new Mul(function.getDiff(x), new Cos(function));
    }

    public String toString() {
        return "sin " + function.toString();
    }
}
