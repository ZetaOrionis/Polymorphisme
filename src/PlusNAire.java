import java.util.ArrayList;
import java.util.List;

public class PlusNAire extends Funct3 {

    public PlusNAire(Function ...list) {
        super(list);
    }

    public double getValue() {
        double result = 0;

        for(Function function : functionList) {
            result += function.getValue();
        }

        return result;
    }

    public Function getDiff(Var x) {

        Function[] functionListDiff = new Function[functionList.size()];

        for (int cmp = 0; cmp < functionList.size(); cmp++) {
            functionListDiff[cmp] = functionList.get(cmp).getDiff(x);
        }

        return new PlusNAire(functionListDiff);
    }

    public String toString() {

        String result = "";

        for (int cmp = 0; cmp < functionList.size(); cmp++) {
            if(cmp == functionList.size() - 1) {
                result += functionList.get(cmp).toString();
            } else {
                result += functionList.get(cmp).toString() + "+";
            }
        }

        return "(" + result + ")";
    }
}
