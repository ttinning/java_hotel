package rooms;

import guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;

    public Room() {
        this.guests = new ArrayList<>();
    }

    public int getNumberOfGuestsInRoom() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }
}
