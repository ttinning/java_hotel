import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.BedroomType;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom("434", BedroomType.DOUBLE, 99);
        guest = new Guest("Aly");

    }

    @Test
    public void hasRoomNumber() {
        assertEquals("434", bedroom.getRoomNumber());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuestsInRoom());
    }

    @Test
    public void canGetBedroomCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(99, bedroom.getNightlyRate());
    }
}
