package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Assert that brackets in the correct order, "[]", return true.
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void invertedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void balancedBracketsWithStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[I'm coming on like a hurricane...]"));
    }

    @Test
    public void unevenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void unevenBracketsOppositeReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void stringWithLineBreakReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[I'm coming on like a hurricane,\nGonna take me higher...]"));
    }

    @Test
    public void oneCurlyBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));
    }

    @Test
    public void concatenatedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[" + "]"));
    }
}
