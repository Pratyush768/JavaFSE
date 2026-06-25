package Exercise12;

public class SlackNotifierDecorator extends NotifierDecorator {


    public SlackNotifierDecorator(Notifier notifier) {

        super(notifier);

    }


    @Override
    public void send(String message) {

        super.send(message);


        System.out.println();

        System.out.println("Sending Slack Notification");
        System.out.println("Message : " + message);
        System.out.println("Slack Message Sent Successfully");

    }

}
