package hotel;

import booking.Booking;
import guests.Guest;
import rooms.Bedroom;
import rooms.BedroomType;
import rooms.ConferenceRoom;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<BedroomType, Integer> bedroomSummary;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bedroomSummary = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }


    public void addBedroom(Bedroom bedroom) {

        this.bedrooms.add(bedroom);
        this.addBedroomToSummary(bedroom);
    }

    public void  addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public Booking makeBooking(Bedroom bedroom, int numberOfNights) {
        return new Booking(bedroom, numberOfNights);
    }

    public void addBedroomToSummary(Bedroom bedroom) {
        BedroomType bedroomType = bedroom.getBedroomType();
        if (this.bedroomSummary.containsKey(bedroomType)) {
            int counter = bedroomSummary.get(bedroomType);
            counter ++;
            this.bedroomSummary.put(bedroomType, counter);
        }
        else {
            this.bedroomSummary.put(bedroomType, 1);
        }
    }


    public int getBedroomSummary(BedroomType bedroomType) {
            return this.bedroomSummary.get(bedroomType);
    }
}
