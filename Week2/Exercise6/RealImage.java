package Exercise13;

public class RealImage implements Image {

    private String fileName;


    public RealImage(String fileName) {

        this.fileName = fileName;
        loadFromServer();

    }


    private void loadFromServer() {

        System.out.println("Connecting to Remote Server...");
        System.out.println("Downloading Image : " + fileName);
        System.out.println("Image Loaded Successfully");

    }


    @Override
    public void display() {

        System.out.println("Displaying Image : " + fileName);

    }

}