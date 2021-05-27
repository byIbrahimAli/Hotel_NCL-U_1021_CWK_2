
/**
 * Project 2
 * @author Ibrahim Ali
 * Student Number: 
 * Date: 16-December-2015 *
 */

public class HotelReport {

    public static void report(Hotel thatHotel) {
        System.out.println("////////////REPORT////////////"); //Header
        System.out.printf("The hotel has vacancy:\t%b\n", thatHotel.hasVacancies()); //Calculates whether there are vacancies available
        System.out.printf("Your Hotel is:\t%s\n", thatHotel.nameOfHotel()); //Name of hotel
        System.out.println("Breakdown"); //Heading
        for (int i = 0; i < thatHotel.numberOfRooms(); i++) {
            System.out.printf("The room no:\t%d\n", i); //Gets every room number
            System.out.printf("\tThe number of beds are:\t\t%s\n", thatHotel.noOfBeds(i)); //Gets every rooms bed count
            for (int j = 0; j < thatHotel.noOfBeds(i); j++) {
                System.out.printf("\tThe size of this bed is:\t%s\n\n", thatHotel.sizeOfBeds(j, i)); //Gets the size of each bed in each room
            }
        }
    }
}
