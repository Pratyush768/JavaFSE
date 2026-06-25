package Exercise12;
public class Main {

    public static void main(String[] args) {


        String message = "Server CPU Usage exceeded 90%!";


        System.out.println("====================================");
        System.out.println("Enterprise Notification System");
        System.out.println("====================================");


        // Scenario 1 : Email Only

        Notifier email = new EmailNotifier();

        System.out.println("\nScenario 1 : Email Only\n");

        email.send(message);



        // Scenario 2 : Email + SMS

        Notifier emailSMS =
                new SMSNotifierDecorator(
                        new EmailNotifier());



        System.out.println("\n------------------------------------");

        System.out.println("\nScenario 2 : Email + SMS\n");

        emailSMS.send(message);



        // Scenario 3 : Email + SMS + Slack

        Notifier emailSMSSlack =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));


        System.out.println("\n------------------------------------");

        System.out.println("\nScenario 3 : Email + SMS + Slack\n");

        emailSMSSlack.send(message);



        // Scenario 4 : Email + SMS + Slack + WhatsApp

        Notifier allChannels =
                new WhatsAppNotifierDecorator(
                        new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                        new EmailNotifier())));


        System.out.println("\n------------------------------------");

        System.out.println("\nScenario 4 : All Channels\n");

        allChannels.send(message);



        System.out.println("\n====================================");
        System.out.println("Notifications Sent Successfully");
        System.out.println("====================================");

    }

}
