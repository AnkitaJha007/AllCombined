package RoundingNumbers;
import java.math.BigDecimal;
import java.math.RoundingMode;
    public class RoundingOfNumbers {
        public static void main(String[] args) {

            int p = 25;
            int s = 5;
            BigDecimal x = new BigDecimal("12345.12345467");
            BigDecimal y = new BigDecimal("12345.123456");

            BigDecimal expectedNum1 = new BigDecimal("12345.12345");
            BigDecimal expectedNum2 = new BigDecimal("12345.12346");

            BigDecimal roundedNum1 = roundingNum(x, p, s).stripTrailingZeros();
            BigDecimal roundedNum2 = roundingNum(y, p, s).stripTrailingZeros();

            System.out.println("Round Num 1: " + roundedNum1);
            System.out.println("Round Num 2: " + roundedNum2);

            System.out.println("Comparing FirstNum: " + roundedNum1.equals(expectedNum1));
            System.out.println("Comparing SecondNum: " + roundedNum2.equals(expectedNum2));
        }
        public static BigDecimal roundingNum(BigDecimal number, int p, int s) {
            return number.setScale(s, RoundingMode.HALF_UP)
                    .setScale(p - s, RoundingMode.HALF_UP);
        }
    }

