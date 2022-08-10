public class CreditCalculator {
    public static long monthlyPayment(long sumCredit, int paymentTerm, int interestRate) {
        return ((sumCredit * (interestRate / 100 / 12) * paymentTerm) + sumCredit) * paymentTerm;
    }

    public static long totalAmount(long sumCredit, int paymentTerm, int interestRate) {
        return (sumCredit * (interestRate / 100 / 12) * paymentTerm) + sumCredit;
    }

    public static long overPayment(long sumCredit, int paymentTerm, int interestRate) {
        return sumCredit * (interestRate / 100 / 12) * paymentTerm;
    }
}
