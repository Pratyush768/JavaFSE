package Exercise12;

public class SMSNotifierDecorator extends NotifierDecorator {


    public SMSNotifierDecorator(Notifier notifier) {

        super(notifier);

    }


    @Override
    public void send(String message) {

        super.send(message);


        System.out.println();

        System.out.println("Sending SMS Notification");
        System.out.println("Message : " + message);
        System.out.println("SMS Delivered Successfully");

    }

}
