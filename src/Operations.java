import Exceptions.OperationException;
import Exceptions.ValueException;

public class Operations {

    public static int result(int value1, int value2, String operation) throws OperationException, ValueException {
        if((value1 < 1) || (value1 > 10) || (value2 < 1) || (value2 > 10)) {
            throw new ValueException();
        }
        int res = 0;
        switch (operation) {
            case ("+"):
                res = Calculator.sum(value1, value2);
                break;
            case ("-"):
                res = Calculator.sub(value1, value2);
                break;
            case ("*"):
                res = Calculator.mul(value1, value2);
                break;
            case ("/"):
                res = Calculator.del(value1, value2);
                break;
            default:
                throw new OperationException();

        }
        return res;
    }
}
