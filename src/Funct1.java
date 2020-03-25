abstract public class Funct1 implements Function {
    protected Function function;

    public Funct1(Function function) {
        this.function = function;
    }

    abstract public double getValue();
}
