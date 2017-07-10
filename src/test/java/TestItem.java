import org.xml.sax.Attributes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestItem {

  private Item testItem;

  @Before
  public void createItemInstance() {
    testItem = new Item("Beans", 0.5);
  }

  @Test
  public void testItemName() {
    assertEquals(testItem.name, "Beans");
  }

  @Test
  public void testItemPrice() {
    assertEquals(testItem.price, 0.5);
  }

}
