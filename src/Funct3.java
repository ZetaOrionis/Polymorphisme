import java.util.ArrayList;
import java.util.List;

abstract public class Funct3 implements Function {

    protected List<Function> functionList;

    public Funct3(Function ...list) {
        functionList = new ArrayList<>();
        for (Function function : list) {
            functionList.add(function);
        }
    }

    abstract public double getValue();
}
