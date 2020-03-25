public class Cos extends Funct1 {

    public Cos(Function function) {
        super(function);
    }

    public double getValue() {
        return Math.cos(super.function.getValue());
    }

    public Function getDiff(Var x) {
        return new Mul(new Minus(new Val(0.0),function.getDiff(x)), new Sin(function));
    }

    public String toString() {
        return "cos " + function.toString();
    }
}