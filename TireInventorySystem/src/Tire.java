public class Tire {
    private String brand;
    private String size;
    private double price;
    private int quantity;

    public Tire(String brand, String size, double price, int quantity) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                ", Size: " + size +
                ", Price: $" + price +
                ", Quantity: " + quantity;
    }
}