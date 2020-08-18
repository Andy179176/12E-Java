package com.company;

/**
 * 12E-Java
 * 18.08.20 17: 06
 */
public class CheckStringCondition implements Condition {
    @Override
    public boolean test(String string) {
        if (string.length() == 4) {
            return true;
        }
        return false;
    }
}
