package com.company;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day +"-" + month +"-"+ year;
    }

    private int getDayPerMonth(int month, int year) {
        int rez = 0;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    rez = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    rez = 30;
                    break;
                case 2:
                    if (isYearLeap(year)) {
                        rez = 29;
                    } else {
                        rez = 28;
                    }
                    break;
                default:
                    rez = -1;
                    break;
            }
        return rez;
    }
        private boolean isYearLeap ( int year){
            return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
        }

    public int dayNumberInTheYear(Date date) {
        if (date.month==1) {
            return date.day;
        }
        int counter=0;
        for (int i = 1; i < date.month; i++) {
            for (int j = 1; j < date.month; j++) {
                counter = date.getDayPerMonth(j, this.year);
                counter += counter;
            }
        }
        return counter+date.day;
    }
}
