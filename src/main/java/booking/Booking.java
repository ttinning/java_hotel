package booking;

import guests.Guest;
import rooms.Bedroom;

import java.util.ArrayList;

public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public int getInvoice() {
        return this.numberOfNights * this.bedroom.getNightlyRate();
    }
}
