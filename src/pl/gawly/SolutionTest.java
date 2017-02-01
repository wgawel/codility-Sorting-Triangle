package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero1() {
        Assert.assertEquals(0, s.solution(new int[]{}));
    }

    @Test
    public void testZero2() {
        Assert.assertEquals(0, s.solution(new int[]{0, 0}));
    }

    @Test
    public void testZero3() {
        Assert.assertEquals(1, s.solution(new int[]{3, 4, 5}));
    }

    @Test
    public void testEx1() {
        Assert.assertEquals(1, s.solution(new int[]{10, 2, 5, 1, 8, 20}));
    }
}
