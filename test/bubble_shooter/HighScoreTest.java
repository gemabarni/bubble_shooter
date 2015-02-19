package bubble_shooter;

import org.junit.Assert;
import org.junit.Test;


public class HighScoreTest {
  @Test
  public void testCompare () {
    HighscoreEntry h1 = new HighscoreEntry("foo", 123, 2, 1);
    HighscoreEntry h2 = new HighscoreEntry("bar", 123, 3, 2);
    
    Assert.assertEquals(h1.compareTo(h2), 0);
  }
  
  
  @Test
  public void testName () {
    HighscoreEntry h1 = new HighscoreEntry("foo", 122, 2, 1);
    h1.setScore(123);
    
    Assert.assertEquals(h1.getScore(), 123);
  }
  
  
  @Test
  public void testColor () {
    HighscoreEntry h1 = new HighscoreEntry("foo", 122, 2, 1);
    h1.setColor(2);
    
    Assert.assertEquals(h1.getColor(), 2);
  }
}
