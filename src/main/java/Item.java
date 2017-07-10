public class Item {

  double quantity;
  String name;
  double price;

  public Item(double quantity, String name, double price) {
    this.quantity = quantity;
    this.name = name;
    this.price = price;
  }

  public double calculatePrice() {
    return quantity * price;
  }
}
