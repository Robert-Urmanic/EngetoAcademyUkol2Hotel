package com.engeto.urm.ukolHotel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {



    public static void main(String[] args) {
	Guest adela = new Guest("Adéla", "Maléková", LocalDate.of(1993,3,13));
	Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5));
    // here we set up out guests
        //System.out.println(adela.getDescription());
        //System.out.println(jan.getDescription());
    Room one = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
    Room two = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
    Room three = new Room(3, 3, false, true, BigDecimal.valueOf(2400));
    // here we set up our rooms
        //System.out.println(one.getDescription());
        //System.out.println(three.getDescription());
    Booking b1 = new Booking(one, adela, LocalDate.of(2021,7,19), LocalDate.of(2021, 7, 27));
    Booking b2 = new Booking(one, adela, LocalDate.of(2021,1,14), LocalDate.of(2021, 1, 14), jan);
    // here we set up our bookings

    BookingTrack track = new BookingTrack();
    // here we initialise tracker
        track.booking.add(b1);
        track.booking.add(b2);
    // here we feed it
        track.getBookingInfo();
    // and here it sings


    }
}
