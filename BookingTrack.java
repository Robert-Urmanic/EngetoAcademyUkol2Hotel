package com.engeto.urm.ukolHotel;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookingTrack {
    protected ArrayList<Booking> booking = new ArrayList<>();
    // What is my purpose?
    // You track bookings.
    // Oh my God.

    public void getBookingInfo() {
        for (Booking book : booking
             ) {
            String extraGuest = "";
            // first iteration of this hell loop goes through the booking, inside of arraylist
            // also we initialise an extraGuest, it's a surprise tool that will help us later
            for (Guest gu: book.guestExtra
                 ) { extraGuest += (gu.getName() + " ");
                // another iteration which gets us the names of EVERY extra guest and adds it to String extraGuest, remember the "Guest ... guestExtraTemp" ?
            }
            if (extraGuest == "") extraGuest = "none";
                // if there were no extra quests, therefore if the initialised variable stayed the same, we set extraGuest to NONE

        /*  if(book.getDateOfArrival().compareTo(LocalDate.now()) < 0) {
                booking.remove(book);
                return;
            }
            POKUDLI JE REZERVACE STARŠÍ, NEŽ DNES, TAK SE NEZMÍNÍ A VYŠKRTNE SE
         */

            System.out.println("Guest " + book.getGuest().getName() + "\nis coming in on :\t" + book.getDateOfArrival() + "\nand is leaving on\t" + book.getDateOfLeave()
                    + "\nwith extra guests: " + extraGuest +"\n-----------------------");
            // printing out all the good stuff that passed the iterations
        }
    }
}
