public class Sqr extends Funct1 {

    public Sqr(Function function) {
        super(function);
    }

    public double getValue() {
        return function.getValue()*function.getValue();
    }

    public Function getDiff(Var x) {
        return new Mul(new Mul(new Val(2),function.getDiff(x)),function);
    }

    public String toString() {
        return "(" + function.toString() + ")²";
    }
}
