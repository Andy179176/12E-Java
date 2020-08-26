package com.company;

import java.util.function.Predicate;

/**
 * 12E-Java
 * 26.08.20 14: 33
 */
public class ConditionForRemove implements Predicate<Booking> {
    @Override
    public boolean test(Booking booking) {
        return false;
    }
}
