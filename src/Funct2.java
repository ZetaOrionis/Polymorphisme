abstract public class Funct2 implements Function {
    protected Function function1;
    protected Function function2;

    public Funct2(Function function1, Function function2) {
        this.function1 = function1;
        this.function2 = function2;
    }

    abstract public double getValue();
}
