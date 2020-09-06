package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class PredicatePalindromeTest {
    @Test
    public void test_isPalindrome_true() {
        String str = "123-?.,4 3 21@#*,?";
        String str1 = " 1 2 3 3 2 1 ";
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertTrue(palindrome.test(str));
        assertTrue(palindrome.test(str1));
    }

    @Test
    public void test_notPalindrome_false() {
        String str = "54891";
        String str1 = "5492171";
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertFalse(palindrome.test(str));
        assertFalse(palindrome.test(str1));
    }

    @Test
    public void test_nullString_false() {
        String str = null;
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertFalse(palindrome.test(str));
    }
    @Test
    public void test_emptyString_true() {
        String str = "";
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertTrue(palindrome.test(str));
    }
}
