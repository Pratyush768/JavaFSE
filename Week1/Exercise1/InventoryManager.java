package exercise1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class InventoryManager {

    private final Map<String, Product> inventory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }


    public void addProduct(Product product) {
        if (product == null)
            throw new IllegalArgumentException("Product cannot be null.");
        if (inventory.containsKey(product.getProductId()))
            throw new IllegalArgumentException(
                    "Product '" + product.getProductId() + "' already exists. Use updateProduct().");
        inventory.put(product.getProductId(), product);
        System.out.println("  [ADD]    " + product);
    }


    public void updateProduct(String productId, Product updatedProduct) {
        if (!inventory.containsKey(productId))
            throw new IllegalArgumentException("Product ID '" + productId + "' not found.");
        inventory.put(productId, updatedProduct);
        System.out.println("  [UPDATE] " + updatedProduct);
    }


    public void deleteProduct(String productId) {
        Product removed = inventory.remove(productId);
        if (removed == null)
            throw new IllegalArgumentException("Product ID '" + productId + "' not found.");
        System.out.println("  [DELETE] Removed → " + removed);
    }


    public Optional<Product> getProduct(String productId) {
        return Optional.ofNullable(inventory.get(productId));
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("  [INFO] Inventory is empty.");
            return;
        }
        System.out.printf("\n                 INVENTORY  (%d products)%n\n", inventory.size());

        inventory.values().forEach(p -> System.out.println(p));
    }

    public Collection<Product> getAllProducts() {
        return Collections.unmodifiableCollection(inventory.values());
    }

    public int size() { return inventory.size(); }
}
