package exercise10;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Computer Builder System =====\n");


        // Gaming PC
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(2000)
                .setGPU("RTX 4090")
                .setBluetooth(true)
                .setWiFi(true)
                .build();




        // Office PC
        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(16)
                .setStorage(512)
                .setWiFi(true)
                .build();




        // Budget PC
        Computer budgetPC = new Computer.Builder()
                .setCPU("AMD Ryzen 3")
                .setRAM(8)
                .setStorage(256)
                .build();



        System.out.println("Gaming PC");
        gamingPC.displayConfiguration();



        System.out.println("\nOffice PC");
        officePC.displayConfiguration();



        System.out.println("\nBudget PC");
        budgetPC.displayConfiguration();

    }
}