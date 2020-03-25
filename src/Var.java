public class Var extends Funct0 {
    private String name;
    private double value = 0.0;

    public Var(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Function getDiff(Var x) {
        return new Val(1.0);
    }

    public String toString() {
        return name;
    }
}
