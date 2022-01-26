import static org.junit.Assert.*;
import org.junit.*;

public class FunWithNumbersTest {

    private int[] a1, a2, a3;

    @Before
    public void setup() throws Exception {
        a1 = new int[] {0, 1, 2, 4};
        a2 = new int[] {2, 4, 1, 4};
        a3 = new int[] {-3, 2, -9, 5};
    }

    @Test
    public void max2sum1() {
        assertEquals("expected 6 to be max2sum of {0, 1, 2, 4}", 6, FunWithNumbers.max2sum(a1));
    }

    @Test
    public void max2sum2() {
        assertEquals("expected 8 to be max2sum of {2, 4, 1 , 4}", 8, FunWithNumbers.max2sum(a2));
    }

    @Test
    public void max2sumIAE() {
        try {
            FunWithNumbers.max2sum(null);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with null array");
    }

    @Test
    public void max2sumOneElement() {
        assertEquals("expected 2 to be max2sum of {2}", 2, FunWithNumbers.max2sum(new int[]{2}));
    }

    @Test
    public void max2sumEmpty() {
        assertEquals("expected 0 to be max2sum of {}", 0, FunWithNumbers.max2sum(new int[]{}));
    }

    @Test
    public void sum() {
        assertEquals("expected -5 to be sum of {-3, 2, -9, 5}", -5, FunWithNumbers.sum(a3));
    }

    @Test
    public void sumEmpty() { assertEquals("expected 0 to be sum of {}", 0, FunWithNumbers.sum(new int[]{}));}

    @Test
    public void sumIAE() {
        try {
            FunWithNumbers.sum(null);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with null array");
    }

    @Test
    public void sumToN1() { assertFalse("expected False to be the sumToN of {0, 1, 2, 4}", FunWithNumbers.sumToN(a1, 100));}

    @Test
    public void sumToN2() { assertTrue("expected True to be the sumToN of {2, 4, 1, 4}", FunWithNumbers.sumToN(a2, 8));}

    @Test
    public void sumToN3() { assertTrue("expected True to be the sumToN of {-3, 2, -9, 5}", FunWithNumbers.sumToN(a3, 2));}

    @Test
    public void sumToNEmpty() { assertFalse("expected False to be the sumToN of {}", FunWithNumbers.sumToN(new int[]{}, 0));}

    @Test
    public void sumToNIAE() {
        try {
            FunWithNumbers.sumToN(null, 0);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with null array");
    }
}
