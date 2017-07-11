import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.HashMap;

public class TestBasket {

  private Basket basket;
  private Item testBeansItem;

  @Before
  public void createBasketInstance() {
    basket = new Basket();
    testBeansItem = new Item(1.0, "Beans", 0.5);
  }

  @Test
  public void testAdd() {
    basket.add(testBeansItem.getName(), testBeansItem.getPrice());
    Map testItems = basket.getItems();
    assertTrue(testItems.containsKey("Beans"));
  }

}
