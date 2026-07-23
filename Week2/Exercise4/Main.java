package Exercise11;

public class Main {

    public static void main(String[] args) {


        System.out.println("=================================");
        System.out.println("Online Payment Processing System");
        System.out.println("=================================\n");


        PaymentProcessor payment;



        payment = new PayPalAdapter();

        System.out.println("Customer selected PayPal");
        payment.processPayment(1500);




        System.out.println("\n------------------------------\n");



        payment = new StripeAdapter();

        System.out.println("Customer selected Stripe");
        payment.processPayment(2500);




        System.out.println("\n------------------------------\n");



        payment = new RazorpayAdapter();

        System.out.println("Customer selected Razorpay");
        payment.processPayment(5000);



        System.out.println("\n=================================");
        System.out.println("All Payments Processed Successfully");
        System.out.println("=================================");

    }
}
