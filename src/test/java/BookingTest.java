import booking.Booking;
import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.BedroomType;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom("434", BedroomType.SINGLE, 99);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(5, booking.getNumberOfNights());
    }

    @Test
    public void canProduceInvoice() {
        assertEquals(495, booking.getInvoice());
    }
}
