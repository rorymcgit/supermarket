import org.xml.sax.Attributes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    // NOW IMPLEMENT A MOCK ITEM OBJECT
    basket.add("Beans", 0.5);
    Map testItems = basket.getItems();
    assertTrue(testItems.containsKey("Beans"));
  }

}
