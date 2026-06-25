package Exercise11;

public class RazorpayAdapter implements PaymentProcessor {

    private RazorpayGateway razorpay;


    public RazorpayAdapter() {

        razorpay = new RazorpayGateway();

    }


    @Override
    public void processPayment(double amount) {

        razorpay.pay(amount);

    }

}
