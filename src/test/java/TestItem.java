import org.xml.sax.Attributes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestItem {

  @Test
  public void testItemName() {
    Item testItem = new Item("Beans");
    assertEquals(testItem.name, "Beans");
  }

}
