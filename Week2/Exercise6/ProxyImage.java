package Exercise13;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;


    public ProxyImage(String fileName) {

        this.fileName = fileName;

    }


    @Override
    public void display() {


        if (realImage == null) {

            System.out.println("\nImage not found in Cache");
            System.out.println("Loading image for the first time...\n");

            realImage = new RealImage(fileName);

        }
        else {

            System.out.println("\nImage found in Cache");

        }


        realImage.display();

    }

}
