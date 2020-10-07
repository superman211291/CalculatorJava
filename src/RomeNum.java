public enum RomeNum {
    I(1, "I"),
    IV(4, "IV"),
    V(5, "V"),
    IX(9, "IX"),
    X(10, "X"),
    XL(40, "XL"),
    L(50,"L"),
    XC(90, "XC"),
    C(100,"C"),
    CD(400, "CD"),
    D(500,"D"),
    CM(900, "CM"),
    M(1000,"M");


    private final int num;
    private final String i;



    RomeNum(int num, String i) {
        this.num = num;
        this.i = i;
    }

    public String getRomeNum() {
        return i;
    }

    private static String getRomeNumWithInt(int num) {
        RomeNum rN[] = RomeNum.values();
        for (int i = 0; i < rN.length; i++) {
            if(rN[i].getNum() == num){
                return rN[i].getRomeNum();
            }
        }
        return null;
    }

    public int getNum() {
        return num;
    }
    private static int getNumWithChar(String romeNum) {
        RomeNum rN[] = RomeNum.values();
        for (int j = 0; j < rN.length ; j++) {
            if (rN[j].getRomeNum().equals(romeNum)){
                return rN[j].getNum();
            }
        }
        return 0;
    }


    public static int romeToInt(String num){
        RomeNum rN[] = RomeNum.values();
        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            if(i == 0 || RomeNum.getNumWithChar(String.valueOf(num.charAt(i))) <= RomeNum.getNumWithChar(String.valueOf(num.charAt(i-1)))) {
                result += RomeNum.getNumWithChar(String.valueOf(num.charAt(i)));
            } else {
                result += RomeNum.getNumWithChar(String.valueOf(num.charAt(i))) - 2 * RomeNum.getNumWithChar(String.valueOf(num.charAt(i-1)));
            }
        }
        return result;
    }

    public static String intToRome(int input) {
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000) {
            s += RomeNum.M.getRomeNum();
            input -= 1000;        }
        while (input >= 900) {
            s += RomeNum.CM.getRomeNum();
            input -= 900;
        }
        while (input >= 500) {
            s += RomeNum.D.getRomeNum();
            input -= 500;
        }
        while (input >= 400) {
            s += RomeNum.CD.getRomeNum();
            input -= 400;
        }
        while (input >= 100) {
            s += RomeNum.C.getRomeNum();
            input -= 100;
        }
        while (input >= 90) {
            s += RomeNum.XC.getRomeNum();
            input -= 90;
        }
        while (input >= 50) {
            s += RomeNum.L.getRomeNum();
            input -= 50;
        }
        while (input >= 40) {
            s += RomeNum.XL.getRomeNum();
            input -= 40;
        }
        while (input >= 10) {
            s += RomeNum.X.getRomeNum();;
            input -= 10;
        }
        while (input >= 9) {
            s += RomeNum.IX.getRomeNum();;
            input -= 9;
        }
        while (input >= 5) {
            s += RomeNum.V.getRomeNum();;
            input -= 5;
        }
        while (input >= 4) {
            s += RomeNum.IV.getRomeNum();;
            input -= 4;
        }
        while (input >= 1) {
            s += RomeNum.I.getRomeNum();;
            input -= 1;
        }
        return s;
    }
}
