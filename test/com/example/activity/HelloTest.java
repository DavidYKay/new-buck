import junit.framework.*;
import static org.junit.Assert.assertEquals;

import com.example.activity.MyFirstActivity;

public class HelloTest extends TestCase {
  protected void setUp() {

  }

  public void testAdd() {
    assertEquals(1, 2);
  }

  public void testActivitySquare() {
    MyFirstActivity activity = new MyFirstActivity();
    assertEquals(9, activity.square(3));
  }
}
