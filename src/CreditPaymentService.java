public class CreditPaymentService {
    public int calculate(int amount, int term, double percent) {
        double monthlyPercent = percent / 12 / 100;
        double coefficient = monthlyPercent * Math.pow(1 + monthlyPercent, term) / (Math.pow(1 + monthlyPercent, term) - 1);
        double monthlyPayment = amount * coefficient;
        return (int) Math.round(monthlyPayment);
    }
}
