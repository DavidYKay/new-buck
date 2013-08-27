import junit.framework.*;
import static org.junit.Assert.assertEquals;
import org.robolectric.RobolectricTestRunner;
import com.example.activity.MyFirstActivity;
import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith(RobolectricTestRunner.class)
public class HelloTest extends TestCase {
  protected void setUp() {

  }

  @Test
  public void testAdd() {
    assertEquals(1, 2);
  }

  @Test
  public void testActivitySquare() {
    MyFirstActivity activity = new MyFirstActivity();
    assertEquals(9, activity.square(3));
  }
}
