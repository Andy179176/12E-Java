package com.company;

import java.util.Comparator;

/**
 * 12E-Java
 * 10.08.20 15: 03
 */
public class BookingComparatorByRoom implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getRoom().getNumber().compareTo(o2.getRoom().getNumber());
    }
}
