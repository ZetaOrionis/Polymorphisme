public class Sqrt extends Funct1 {

    public Sqrt(Function function) {
        super(function);
    }

    public double getValue() {
        return Math.sqrt(super.function.getValue());
    }

    public Function getDiff(Var x) {
        return new Inv(new Mul(function.getDiff(x), new Sqrt(function)));
    }

    public String toString() {
        return "sqrt " + function.toString();
    }
}