package Exercise12;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {

        System.out.println("Sending Email Notification");
        System.out.println("Message : " + message);
        System.out.println("Email Delivered Successfully");

    }

}