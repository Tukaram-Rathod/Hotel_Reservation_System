package hotelReservation;

import java.util.ArrayList;

public class HotelReservationSystem {
    static ArrayList<Hotel> hotelList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program ");

        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        Hotel hotel1 = new Hotel("LakeWood",110);
        hotelReservationSystem.addHotel(hotel1);
        Hotel hotel2 = new Hotel("BridgeWood",160);
        hotelReservationSystem.addHotel(hotel2);
        Hotel hotel3 = new Hotel("RidgeWood",220);
        hotelReservationSystem.addHotel(hotel3);
    }
    public boolean addHotel(Hotel hotel) {
        return hotelList.add(hotel);
    }

}
