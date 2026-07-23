package Exercise12;
public class WhatsAppNotifierDecorator extends NotifierDecorator {


    public WhatsAppNotifierDecorator(Notifier notifier) {

        super(notifier);

    }


    @Override
    public void send(String message) {

        super.send(message);


        System.out.println();

        System.out.println("Sending WhatsApp Notification");
        System.out.println("Message : " + message);
        System.out.println("WhatsApp Message Delivered");

    }

}