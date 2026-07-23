package exercise1;


public class InventoryDemo {

    public static void main(String[] args) {
        System.out.println("EXERCISE 1 — Inventory Management System\n");

        InventoryManager manager = new InventoryManager();

        System.out.println("Adding Products");
        manager.addProduct(new Product("P001", "Laptop",         50,  999.99));
        manager.addProduct(new Product("P002", "Mouse",         200,   25.50));
        manager.addProduct(new Product("P003", "Keyboard",      150,   45.00));
        manager.addProduct(new Product("P004", "Monitor",        30,  299.99));
        manager.addProduct(new Product("P005", "USB-C Hub",     100,   59.99));
        manager.displayInventory();
        System.out.println();
        //update
        System.out.println("2. Updating Product P002 (Mouse → Wireless Mouse)");
        manager.updateProduct("P002", new Product("P002", "Wireless Mouse", 180, 35.99));

        System.out.println();

        //fetch

        System.out.println("3. Fetching Product P001");
        manager.getProduct("P001")
                .ifPresent(p -> System.out.println("  [GET] Found → " + p));
        System.out.println();


        System.out.println("4. Deleting Product P003 (Keyboard)");
        manager.deleteProduct("P003");
        System.out.println();

        System.out.println("5. Final Inventory State");
        manager.displayInventory();
        System.out.println();

        System.out.println("6. Error Handling");
        try {
            manager.addProduct(new Product("P001", "Duplicate", 1, 1.0));
        } catch (IllegalArgumentException e) {
            System.out.println("  [CAUGHT] " + e.getMessage());
        }
        try {
            manager.deleteProduct("INVALID_ID");
        } catch (IllegalArgumentException e) {
            System.out.println("  [CAUGHT] " + e.getMessage());
        }


    }


    static void printHeader(String title) {
        System.out.printf( "║  %-56s║%n", " " + title);
    }
    static void section(String label) {
        System.out.println("\n  ── " + label + " " + "─".repeat(Math.max(0, 52 - label.length())));
    }
    static void printFooter() {
        System.out.println("══════════════════════════════════════════════════════════════\n");
    }
}
