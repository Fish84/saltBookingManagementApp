package com.saltsoftware.factory.bookingSchedule;


import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingSchedule Factory test cases
 */

public class BookingScheduleFactoryTest {

    private BookingSchedule book1;
    private BookingSchedule book2;

    @Before
    public void testCreateBookingSchedule() {
        book1 = BookingScheduleFactory.createBookingSchedule();
        book2 = BookingScheduleFactory.createBookingSchedule();
    }

    @Test
    public void testEquality() {

        //Equality test
        assertEquals(book1.getBookingID(),book1.getBookingID());
        assertEquals(book2.getPatientID(),book2.getPatientID());
    }

    @Test
    public void testNotNull() {

        //NotNull test
        assertNotNull(book1.getBookingID());
        assertNotNull(book2.getPatientID());
    }

    @Test
    public void testIdentity() {

        //Identity test
        assertSame(book1.getBookingID(), book1.getBookingID());
        assertSame(book2.getPatientID(), book2.getPatientID());
    }

}