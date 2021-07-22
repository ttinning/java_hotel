import booking.Booking;
import guests.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.BedroomType;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers");
        bedroom = new Bedroom("434", BedroomType.DOUBLE, 99);
        conferenceRoom = new ConferenceRoom("Edinburgh Suite", 5);
        guest = new Guest("Aly");
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void canGetNumberOfBedrooms() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canGetNumberOfConferenceRooms() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckInGuestToBedroom() {
        hotel.checkInGuestToBedroom(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuestsInRoom());
    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.checkInGuestToConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getNumberOfGuestsInRoom());
    }

    @Test
    public void canMakeBooking() {
        Booking booking = hotel.makeBooking(bedroom, 4);
        assertEquals(4, booking.getNumberOfNights());
    }

    @Test
    public void canGetBedroomSummary() {
        Bedroom single = new Bedroom("1", BedroomType.SINGLE, 55);
        Bedroom triple = new Bedroom("3", BedroomType.TRIPLE, 200);
        hotel.addBedroom(single);
        hotel.addBedroom(single);
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        hotel.addBedroom(triple);
        assertEquals(1, hotel.getBedroomSummary(BedroomType.TRIPLE));
    }
}
