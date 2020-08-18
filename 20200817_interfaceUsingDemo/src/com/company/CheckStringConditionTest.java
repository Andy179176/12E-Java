package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 12E-Java
 * 18.08.20 17: 21
 */
class CheckStringConditionTest {
    @Test
    public void CheckStringConditionTestTrue() {
        Condition condition = new CheckStringCondition();
        String str = "1234";
        assertTrue(condition.test(str));
    }

    @Test
    public void CheckStringConditionTestFalse() {
        Condition condition = new CheckStringCondition();
        String str = " ";
        assertFalse(condition.test(str));
    }

}