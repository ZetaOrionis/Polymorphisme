public class Plus extends Funct2 {

    public Plus(Function function1, Function function2) {
        super(function1, function2);
    }

    public double getValue() {
        return function1.getValue() + function2.getValue();
    }

    public Function getDiff(Var x) {
        return new Plus(function1.getDiff(x), function2.getDiff(x));
    }

    public String toString() {
        return "(" + function1.toString() + "+" + function2.toString() + ")";
    }
}
