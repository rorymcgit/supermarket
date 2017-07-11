import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestItem {

  private Item testItem;
  private final double comparisonTolerance = 0.005;

  @Before
  public void createItemInstance() {
    testItem = new Item(1.0, "Beans", 0.5);
  }

  @Test
  public void testItemName() {
    assertEquals(testItem.getName(), "Beans");
  }

  @Test
  public void testItemQuantity() {
    assertEquals(testItem.getQuantity(), 1.0, comparisonTolerance);
  }

  @Test
  public void testGetPrice() {
    assertEquals(testItem.getPrice(), 0.5, comparisonTolerance);
  }

  @Test
  public void testGetPriceForFractionalQuantity() {
    Item AnotherTestItem = new Item(0.5, "Oranges/kg", 2.0);
    assertEquals(AnotherTestItem.getPrice(), 1.0, comparisonTolerance);
  }

}
