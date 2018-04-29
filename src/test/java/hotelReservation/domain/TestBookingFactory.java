package hotelReservation.domain;

import hotelReservation.factories.BookingFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
public class TestBookingFactory {
    private Booking booking;
    private Booking newBooking;
    private List<Room> rooms;
    @Before
    public void setUp()
    {
        booking = BookingFactory.createBooking("01234", null, null, null);
    }
    @Test
    public void testCreate() throws Exception
    {
        Assert.assertEquals("01234", booking.getReferenceNumber());
    }
    @Test
    public void testUpdate() throws Exception
    {
        newBooking = new Booking
                .Builder(booking.getReferenceNumber())
                .copy(booking)
                .rooms(rooms)
                .build();
        Assert.assertEquals("01234", newBooking.getReferenceNumber());
        Assert.assertEquals(rooms, newBooking.getRooms());
    }
    @After
    public void tearDown()
    {

    }
}
