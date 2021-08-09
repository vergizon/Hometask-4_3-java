public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthPayment1year = service.calculate(9.99, 1000000, 1);
        int res = (int) monthPayment1year;
        System.out.println(res);

        double monthPayment2years = service.calculate(9.99, 1000000, 2);
        res = (int) monthPayment2years;
        System.out.println(res);

        double monthPayment3years = service.calculate(9.99, 1000000, 3);
        res = (int) monthPayment3years;
        System.out.println(res);
    }
}
