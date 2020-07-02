import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberCheckerTest {

    @Test
    public void LowestPrimeTest() throws Exception {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        assertTrue(checker.isPrime(2));
    }

    @Test
    public void HighestPrimeTest() throws Exception {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        assertTrue(checker.isPrime(999983));
    }

    @Test
    public void HighestNonPrimeTest() throws Exception {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        assertFalse(checker.isPrime(1000000));
    }

    @Test
    public void LowestNonPrimeTest() throws Exception {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        assertFalse(checker.isPrime(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void IllegalInputLowBorderPrimeTest() throws Exception {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        checker.isPrime(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IllegalInputHihgBorderPrimeTest() throws Exception {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        checker.isPrime(1000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IllegalInputNullBorderPrimeTest() throws Exception {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        checker.isPrime(null);
    }
}