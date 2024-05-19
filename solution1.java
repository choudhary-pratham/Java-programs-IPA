import java.util.*;

public class solution1 {
    static int hotelByHighestRating(ArrayList<hotel> hotelObj, String cabfac) {
        int maxhotelRating = 0;
        for (int i = 0; i < hotelObj.size(); i++) {
            hotel obj = hotelObj.get(i);
            if ((obj.gethotelRating() > maxhotelRating) && (obj.gethotelRating() > 5)
                    && (obj.getcabFacility().equalsIgnoreCase(cabfac))) {
                maxhotelRating = obj.gethotelRating();
            }
        }
        return maxhotelRating;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<hotel> hotelObj = new ArrayList<hotel>();
        for (int i = 0; i < 4; i++) {
            int hotelId = Integer.parseInt(sc.nextLine());
            String hotelName = sc.nextLine();
            String cabFacility = sc.nextLine();
            int hotelRating = Integer.parseInt(sc.nextLine());
            int hotelFees = Integer.parseInt(sc.nextLine());
            hotel obj = new hotel(hotelId, hotelName, cabFacility, hotelRating, hotelFees);
            hotelObj.add(obj);
        }
        String cabfac = sc.nextLine();
        int result = hotelByHighestRating(hotelObj, cabfac);
        if (result == 0) {
            System.out.println("No hotel with max rating");
        } else {
            System.out.println(result);
        }
        sc.close();
    }
}
