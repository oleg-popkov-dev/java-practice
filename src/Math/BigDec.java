package Math;

import java.math.BigDecimal;

public class BigDec {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("100000");

        for(int i = 1; i <= 5; i++){
            bigDecimal = bigDecimal.add(bigDecimal.multiply(new BigDecimal("0.09")));
            System.out.println("В " + i + " год " + bigDecimal.toBigInteger());
        }
    }
}