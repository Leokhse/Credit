public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 9.99;
        for (int i = 1; i <= 3; i++) {
            int term = i * 12;
            int monthlyPayment = service.calculate(amount, term, percent);
            System.out.println("Ежемесячный платеж на " + i + " год: " + monthlyPayment + " рублей");
        }
    }
}