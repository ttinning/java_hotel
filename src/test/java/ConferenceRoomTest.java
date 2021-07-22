import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Suite;
import rooms.Bedroom;
import rooms.BedroomType;
import rooms.ConferenceRoom;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom ("Edinburgh Suite", 5);
        guest = new Guest("Aly", 2);

    }


    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getNumberOfGuestsInRoom());
    }

    @Test
    public void canGetConferenceCapacity() {
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Edinburgh Suite", conferenceRoom.getName());
    }
}
