package com.engeto.urm.ukolHotel;

import java.time.LocalDate;
import java.util.ArrayList;
    // todo is stay recreational or for work ?
public class Booking {
    private Room room;
    private Guest guest;
    private Guest guestExtraTemp;
    protected ArrayList<Guest> guestExtra = new ArrayList<>();
    private LocalDate dateOfArrival;
    private LocalDate dateOfLeave;

    public Booking(Room room, Guest guest, LocalDate dateOfArrival, LocalDate dateOfLeave) {
        this.room = room;
        this.guest = guest;
        this.dateOfArrival = dateOfArrival;
        this.dateOfLeave = dateOfLeave;
    }   // should have used "this()" also this constructor was needed in case of solo bookings



    public Booking(Room room, Guest guest, LocalDate dateOfArrival, LocalDate dateOfLeave, Guest ... guestExtraTemp) {
        this.room = room;
        this.guest = guest;
        //this.guestExtra = guestExtra;
        this.dateOfArrival = dateOfArrival;
        this.dateOfLeave = dateOfLeave;
        for (Guest g:guestExtraTemp
             ) {
            guestExtra.add(g);
        }
    }

    // here we are gathering all the information, Guest ... guestExtraTemp used to keep unspecified amount of extra guests temporarily before moving to a list;
    // for each iteration used to feed the list

    // incoming auto generated getters and setters
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuestExtraTemp() {
        return guestExtraTemp;
    }

    public void setGuestExtraTemp(Guest guestExtraTemp) {
        this.guestExtraTemp = guestExtraTemp;
    }

    public ArrayList<Guest> getGuestExtra() {
        return guestExtra;
    }

    public void setGuestExtra(ArrayList<Guest> guestExtra) {
        this.guestExtra = guestExtra;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public LocalDate getDateOfLeave() {
        return dateOfLeave;
    }

    public void setDateOfLeave(LocalDate dateOfLeave) {
        this.dateOfLeave = dateOfLeave;
    }
}
