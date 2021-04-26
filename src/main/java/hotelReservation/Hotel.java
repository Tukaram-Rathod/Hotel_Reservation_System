package hotelReservation;

public class Hotel {
    String hotelName;
    Integer customerRate;
    public Hotel(String hotelName, Integer customerRate) {
        this.hotelName = hotelName;
        this.customerRate = customerRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getCustomerRate() {
        return customerRate;
    }

    public void setCustomerRate(Integer customerRate) {
        this.customerRate = customerRate;
    }
}
