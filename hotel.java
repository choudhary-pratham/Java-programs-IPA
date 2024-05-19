public class hotel {
    private int hotelId;
    private String hotelName;
    private String cabFacility;
    private int hotelRating;
    private int hotelFees;

    hotel(int hotelId, String hotelName, String cabFacility, int hotelRating, int hotelFees) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.cabFacility = cabFacility;
        this.hotelRating = hotelRating;
        this.hotelFees = hotelFees;
    }

    public int gethotelId() {
        return this.hotelId;
    }

    public String gethotelName() {
        return this.hotelName;
    }

    public String getcabFacility() {
        return this.cabFacility;
    }

    public int gethotelRating() {
        return this.hotelRating;
    }

    public int gethotelFees() {
        return this.hotelFees;
    }

    public void sethotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void sethotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setcabFacility(String cabFacility) {
        this.cabFacility = cabFacility;
    }

    public void sethotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }

    public void setHotelFees(int hotelFees) {
        this.hotelFees = hotelFees;
    }
}
