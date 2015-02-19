package bubble_shooter;

import java.awt.Color;
import java.awt.Point;


import org.junit.Assert;
import org.junit.Test;

public class BubbleTest {  
  @Test
  public void testCenterLocation () {
    Bubble b = new Bubble(Color.green);
    b.setLocation(new Point(100, 100));
    
    Point center = b.getCenterLocation();
    
    Assert.assertEquals(center.x, 115);
    Assert.assertEquals(center.y, 115);
  }
  
  
  @Test
  public void testRandomColor () {
    for (int i = 0; i < 10000; ++i) {
      
      Assert.assertFalse(Bubble.getRandomColor(7).equals(Color.darkGray));
    
    }
  }
  
  
  @Test
  public void testBubbleDist () {
    Bubble b1 =  new Bubble(Color.green);
    Bubble b2 =  new Bubble(Color.blue);
    
    b1.setLocation(new Point(100, 100));
    b2.setLocation(new Point(200, 200));
    
    double d = Math.sqrt(Math.pow(115 - 215, 2) + Math.pow(115 - 215, 2));
    
    Assert.assertEquals(Game.BubbleDist(b1, b2), d, 0.0001);
  }
  
  
  @Test
  public void testStop () {
    Game g = new Game(0, 0, new Canvas());
    
    g.stop();
    
    Assert.assertTrue(g.isStopped());
  }
}
