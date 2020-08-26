package com.company;

import java.util.Comparator;

public interface BookingList {
    void add(Booking booking);
    int size();
    void  print();

    Booking[] getSortedArray(Comparator<Booking> comparator);

    Booking getByIndex(int i);

    int findIndexOfObject(Booking booking);

    Booking[] remove(Booking booking);


}
