package hotelReservation;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class HotelReservationSystemTest {
    @Test
    //information of hotel name and customer rate when Hotel get added
    public void givenHotelname_And_CustomerRate_ShouldAddHotel(){
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel = new Hotel("Lakewood",110);
        boolean result = hotelReservationSystem.addHotel(hotel);
        Assert.assertTrue(result);
    }
    @Test
    //information of hotel name and customer rate when Hotel get not added
    public void givenHotelname_And_CustomerRate_ShouldNotAddHotel(){
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel = new Hotel("Lakewood",110);
        boolean result = hotelReservationSystem.addHotel(hotel);
        Assert.assertTrue(result);
    }

}
