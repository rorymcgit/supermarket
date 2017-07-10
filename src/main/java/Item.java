public class Item {

  private double quantity;
  private String name;
  private double price;

  public Item(double quantity, String name, double price) {
    this.quantity = quantity;
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return quantity * price;
  }

  public String getName() {
    return name;
  }

  public double getQuantity() {
    return quantity;
  }
}
