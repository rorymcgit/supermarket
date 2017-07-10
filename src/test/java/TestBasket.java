import org.xml.sax.Attributes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.HashMap;

public class TestBasket {

  private Basket basket;

  @Before
  public void createBasketInstance() {
    basket = new Basket();
  }

  @Test
  public void testAdd() {
    basket.add("Beans", 1.0);
    Map testItems = basket.getItems();
    assertEquals(testItems.containsKey("Beans"), true);
  }

}
