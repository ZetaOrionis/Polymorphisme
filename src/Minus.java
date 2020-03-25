public class Minus extends Funct2 {

    public Minus(Function function1, Function function2){
        super(function1,function2);
    }

    public double getValue() {
        return function1.getValue() - function2.getValue();
    }

    public Function getDiff(Var x) {
        return new Val(0.0);
    }

    public String toString() {
        return "(" + function1.toString() + "-" + function2.toString() + ")";
    }
}
