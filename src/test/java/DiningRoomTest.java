import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Suite;
import rooms.*;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom ("Canteen", 5);
        guest = new Guest("Aly", 2);

    }


    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getNumberOfGuestsInRoom());
    }

    @Test
    public void canGetConferenceCapacity() {
        assertEquals(5, diningRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Canteen", diningRoom.getName());
    }
}
