public class Inv extends Funct1 {

    public Inv(Function function) {
        super(function);
    }

    public double getValue() {
        return super.function.getValue()/1;
    }

    public Function getDiff(Var x) {
        return new Minus(new Val(0.0), new Mul(function.getDiff(x), new Inv(new Sqr(function))));
    }

    public String toString() {
        return "( 1/" + function.toString() + " )";
    }
}