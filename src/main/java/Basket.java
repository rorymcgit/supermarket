import java.util.Map;
import java.util.HashMap;

public class Basket {

  private Map<String, Double> items;

  public Basket() {
    this.items = new HashMap();
  }

  public Map<String, Double> getItems() {
    return items;
  }

  public void add(String name, double cost) {
    items.put(name, cost);
  }
}
