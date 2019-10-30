package multithreading;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;

@RunWith(ConcurrentTestRunner.class)
public class CountCheckTest {
  private final static int THREAD_COUNT = 50;
  //private NonAtomicCounter counter = new NonAtomicCounter();
  private AtomicCounter counter = new AtomicCounter();

  @Before
  public void initialCount(){
    counter.initialize(2);
  }

  @Test
  @ThreadCount(THREAD_COUNT)
  public void addOne() {
    counter.addOne();
  }

  @After
  public void testCount() {
    assertEquals("Value should be 12", 52, counter.getCount());
  }
}
