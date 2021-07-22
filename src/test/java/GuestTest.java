import guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Dave", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Dave", guest.getName());
    }

    @Test
    public void canSetName() {
        guest.setName("Aly");
        assertEquals("Aly", guest.getName());
    }
}
