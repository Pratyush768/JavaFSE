package exercise1;

public class Product {

    private final String productId;
    private String       productName;
    private int          quantity;
    private double       price;

    public Product(String productId, String productName, int quantity, double price) {
        if (productId == null || productId.trim().isEmpty())
            throw new IllegalArgumentException("Product ID cannot be null or empty.");
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity cannot be negative.");
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative.");

        this.productId   = productId.trim();
        this.productName = productName;
        this.quantity    = quantity;
        this.price       = price;
    }



    public String getProductId()   {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public int    getQuantity()    {
        return quantity;
    }
    public double getPrice()       {
        return price;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        this.price = price;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        return productId.equals(((Product) obj).productId);
    }

    public int hashCode() {
        return productId.hashCode();
    }

    public String toString() {
        return String.format("Product{ ID=%-6s | Name=%-15s | Qty=%4d | Price=%8.2f }",
                productId, productName, quantity, price);
    }
}
