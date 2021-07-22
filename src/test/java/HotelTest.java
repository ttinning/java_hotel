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
        bedroom = new Bedroom("434", BedroomType.DOUBLE);
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
}
