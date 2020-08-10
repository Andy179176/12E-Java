package com.company;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new Date(30, 7, 2020),
                        new Date(10, 8, 2020))
        );

        Booking b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))
        );

        Booking b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick1"),
                new DateInterval(new Date(16, 8, 2020),
                        new Date(13, 8, 2020))
        );

        Booking b4 = new Booking(
                new SuiteRoom("4", 2),
                new Person("Nick2"),
                new DateInterval(new Date(07, 01, 2010),
                        new Date(13, 8, 2020))
        );

        Booking[] bookings = {b1, b2, b3, b4};

        BookingList bookingList = new ArrayBookingList(2);
        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
        bookingList.add(b4);
        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
        //bookingList.print();


        System.out.println("----------sort by room's number---------");// сортировка через Comparator
        sort(bookings, new BookingComparatorByRoom());
        System.out.println("sort by room's number\n" + Arrays.toString(bookings));

        System.out.println("----------sort by startDate---------");// сортировка через Comparator
        sort(bookings, new BookingComparatorByStartDate());
        System.out.println("sort by startDate\n" + Arrays.toString(bookings));


    }
}
