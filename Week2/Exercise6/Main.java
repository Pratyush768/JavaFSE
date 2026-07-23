package Exercise13;


public class Main {

    public static void main(String[] args) {


        System.out.println("=================================");
        System.out.println("Remote Image Viewer Application");
        System.out.println("=================================");



        Image image1 = new ProxyImage("nature.jpg");


        System.out.println("\nFirst Request");

        image1.display();



        System.out.println("\n-----------------------------");


        System.out.println("\nSecond Request");

        image1.display();



        System.out.println("\n-----------------------------");


        Image image2 = new ProxyImage("mountain.jpg");


        System.out.println("\nThird Request");

        image2.display();



        System.out.println("\n=================================");
        System.out.println("Images Displayed Successfully");
        System.out.println("=================================");

    }

}