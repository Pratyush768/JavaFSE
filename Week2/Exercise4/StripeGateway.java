package Exercise11;

public class StripeGateway {

    public void chargeAmount(double amount) {

        System.out.println("Connecting to Stripe...");
        System.out.println("Charging Rs." + amount);
        System.out.println("Payment Successful via Stripe");

    }

}
