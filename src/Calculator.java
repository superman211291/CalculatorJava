import Exceptions.ValueException;

public class Calculator {
    public static int sum(int val1, int val2) throws ValueException {
        return val1 + val2;
    }
    public static int sub(int val1, int val2){
        return val1 - val2;
    }
    public static int mul(int val1, int val2){
        return val1 * val2;
    }
    public static int del(int val1, int val2){
        return val1 / val2;
    }

}

