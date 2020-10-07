import Exceptions.OperationException;
import Exceptions.ValueException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите числа:");
        Scanner scanner = new Scanner(System.in);
         String value1 = scanner.next();
        final String operation = scanner.next();
         String value2 = scanner.next();
        try {
            if ((RomeNum.romeToInt(value1) == 0) && (RomeNum.romeToInt(value2) == 0)) {
                System.out.println(Operations.result(Integer.parseInt(value1), Integer.parseInt(value2), operation));
            } else {
                System.out.println(RomeNum.intToRome(Operations.result(RomeNum.romeToInt(value1), RomeNum.romeToInt(value2), operation)));
            }
        }
        catch (ValueException valE){
            System.out.println("Введенные числа неверны!");
        }
        catch (OperationException operE){
            System.out.println("Введенная операция не верна!");
        }



    }


}

