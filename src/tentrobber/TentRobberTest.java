package tentrobber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TentRobberTest {
    
    private static final long TIME_LIMIT = 6000;
    
    private TentRobber tb;
    
    @Before
    public void setUp() {
        tb = new TentRobber();
    }
    
    @After
    public void tearDown() {
        tb = null;
    }
    
    @Test
    public void testcase1() {
        int[] values = {1, 2, 3, 4};
        assertEquals("test 1 failed", 6, tb.rob(values));
    }
    
    @Test
    public void testcase2() {
        int[] values = {2, 1, 1, 2};
        assertEquals("test 2 failed", 4, tb.rob(values));
    }
    
    @Test
    public void testcase3() {
        int[] values = {24, 34, 1, 100, 99, 20, 67, 66, 66, 35};
        assertEquals("test 3 failed", 267, tb.rob(values));
    }
    
    @Test
    public void testcase4() {
        long start = System.nanoTime();
        int[] values = {76, 32, 96, 10, 98, 5, 97, 19, 20, 32};
        int result = tb.rob(values);
        long end = System.nanoTime();
        assertEquals("test 4 failed", 399, result);
        assertTrue("time limit exceeded", (end - start) < TIME_LIMIT);
    }

}
