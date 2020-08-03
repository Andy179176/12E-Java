package com.company;

public class Main {

    public static void main(String[] args) {
        Date date= new Date(10,3,2020);
        System.out.println(date.dayNumberInTheYear(date));

	  Booking b1=new Booking(
	          new StandardRoom("1",2),
              new Person("Jack"),
              new DateInterval(new Date(30,7,2020),
                                new Date(10,8,2020))
      );


        Booking b2=new Booking(
                new SuiteRoom("2",2),
                new Person("Nick"),
                new DateInterval(new Date(11,8,2020),
                        new Date(13,8,2020))
        );

        System.out.println(b1);
        System.out.println(b2);
    }

}
