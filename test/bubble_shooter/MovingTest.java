package bubble_shooter;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;


public class MovingTest {
  @Test
  public void testMove () {
    Bubble b = new Bubble(Color.green);
    b.setLocation(new Point(100, 100));
    
    Point d = new Point(200, 200);

    MovingBubble mb = new MovingBubble(b, d);
    
    mb.move();
    
    Assert.assertEquals(mb.loc.x, 99);
    Assert.assertEquals(mb.loc.y, 95);
  }
}
