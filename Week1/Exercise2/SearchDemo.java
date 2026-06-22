package exercise2;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println("--------Product found---------");
        System.out.println(productId + " | " + productName + " | " + category);
    }
}

public class SearchDemo {

    static Product linearSearch(Product[] products, int key) {
        for (Product p : products) {
            if (p.productId == key) {
                return p;
            }
        }
        return null;
    }

    static Product binarySearch(Product[] products, int key) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == key) {
                return products[mid];
            } else if (products[mid].productId < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        Product result1 = linearSearch(products, 104);

        System.out.println("Linear Search:");
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        Product result2 = binarySearch(products, 104);

        System.out.println("\nBinary Search:");
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }
        Product result3 = linearSearch(products, 106);

        System.out.println("Linear Search:");
        if (result3 != null) {
            result3.display();
        } else {
            System.out.println("Product not found");
        }

        Product result4 = binarySearch(products, 113);

        System.out.println("\nBinary Search:");
        if (result4 != null) {
            result4.display();
        } else {
            System.out.println("Product not found");
        }

    }
}
