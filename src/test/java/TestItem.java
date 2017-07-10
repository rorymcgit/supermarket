import org.xml.sax.Attributes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestItem {

  private Item testItem;

  @Before
  public void createItemInstance() {
    testItem = new Item(1.0, "Can of Beans", 0.5);
  }

  @Test
  public void testItemName() {
    assertEquals(testItem.name, "Can of Beans");
  }

  @Test
  public void testItemPrice() {
    assertEquals(testItem.price, 0.5);
  }

  @Test
  public void testItemAmount() {
    assertEquals(testItem.quantity, 1.0);
  }

  @Test
  public void testCalculatePrice() {
    assertEquals(testItem.calculatePrice(), 0.5);
  }

  @Test
  public void testCalculatePriceForFractionalQuantity() {
    Item AnotherTestItem = new Item(0.5, "Kilogram of Oranges", 2.0);
    assertEquals(AnotherTestItem.calculatePrice(), 1.0);
  }

}
