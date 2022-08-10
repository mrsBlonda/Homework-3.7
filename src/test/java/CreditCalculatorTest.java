import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.assertTrue;

public class CreditCalculatorTests {
    static Random random = new Random();


    @Test
    public static void monthlyPaymentTest () {
        CreditCalculator creditCalculator = new CreditCalculator();
        long sumCredit = random.nextLong();
        int paymentTerm = random.nextInt(40);
        int interestRate = random.nextInt(35);
        long result = creditCalculator.monthlyPayment(sumCredit, paymentTerm, interestRate);
        assertTrue("Неверный расчет ",
                ((sumCredit * (interestRate/100/12) * paymentTerm) + sumCredit) * paymentTerm == result);
    }

    @Test
    public static void totalAmountTest () {
        CreditCalculator creditCalculator = new CreditCalculator();
        long sumCredit = random.nextLong();
        int paymentTerm = random.nextInt(40);
        int interestRate = random.nextInt(40);
        long result = creditCalculator.totalAmount(sumCredit, paymentTerm, interestRate);
        assertTrue("Неверный расчет ",
                (sumCredit * (interestRate/100/12) * paymentTerm) + sumCredit == result);

    }

    @Test
    public static void overPaymentTest () {
        CreditCalculator creditCalculator = new CreditCalculator();
        long sumCredit = random.nextLong();
        int paymentTerm = random.nextInt(40);
        int interestRate = random.nextInt(35);
        long result = creditCalculator.overPayment(sumCredit, paymentTerm, interestRate);
        assertTrue("Неверный расчет", sumCredit * (interestRate/100/12) * paymentTerm == result);
    }




}
