public class Mul extends Funct2 {

    public Mul(Function function1, Function function2) {
        super(function1, function2);
    }

    public double getValue() {
        return function1.getValue() * function2.getValue();
    }

    public Function getDiff(Var x) {
        return new Plus(new Mul(function1.getDiff(x),function2),new Mul(function1,function2.getDiff(x)));
    }

    public String toString() {
        return "(" + function1.toString() + "*" + function2.toString() + ")";
    }
}
