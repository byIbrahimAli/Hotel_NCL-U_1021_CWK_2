
/**
 * Project 2
 * @author Ibrahim Ali
 * Student Number: 
 * Date: 16-December-2015 *
 */

//Import
import java.util.*;

public class HotelConfigure {

    private static Scanner i = new Scanner(System.in); //Simple user interface
    private static final String[] BEDSIZE = {"Double", "King", "Queen", "Single"}; //Array of bed sizes

    public static void main(String[] args) {
        //Hotel name
        System.out.println("Enter hotel name:");
        Hotel xHotel = new Hotel(i.nextLine());

        //Total rooms
        System.out.println("How many rooms would you like to add to the hotel:");
        int x = i.nextInt();

        if (x < 0) { //Validation
            throw new IllegalArgumentException("Please re-try. Do not enter negative numbers.");
        }

        for (int j = 0; j < x; j++) {
            xHotel.addRoom(newRoom());
        }
        HotelReport.report(xHotel);
    }

    //Creates/configures room
    public static Room newRoom() {

        //Total beds
        System.out.println("How many beds would you like: ");
        int x = i.nextInt();

        if (x < 0 || x > 8) { //Validation
            throw new IllegalArgumentException("Please re-try. Enter a value between 0 and 7."); //Max value of bed is 7
        }

        Bed[] noBeds = new Bed[x];

        //Prints BEDSIZE array
        Arrays.sort(BEDSIZE);
        System.out.println("BedSizes:");
        for (int i = 0; i < BEDSIZE.length; i++) {
            System.out.format("%d. %s\n", i, BEDSIZE[i]);
        }

        //Select bed size
        for (int i = 0; i < x; i++) {
            boolean check = false;

            while (check == false) { //Validation
                try {
                    System.out.println("Enter 0 for Double, 1 for King, 2 for Queen, 3 for Single bed");
                    int sBedSize = HotelConfigure.i.nextInt();

                    if (sBedSize >= 0 && sBedSize <= 3) {
                        check = true;
                        noBeds[i] = new Bed(BEDSIZE[sBedSize]);
                    } else {
                        System.out.println("Please enter an integer from 0 to 3");
                    }
                } catch (InputMismatchException IME) {
                    System.out.println("You entered a string value. Please enter an integer");
                }
            }
        }

        Room room = new Room(noBeds);
        boolean check = false;

        //Book room
        while (check == false) { //Validation
            try {
                System.out.println("Would you like to book room, enter true or false:");
                boolean b = i.nextBoolean();
                check = true;
                if (b) { //Simplified if statement due to boolean
                    room.bookRoom();
                }
            } catch (InputMismatchException exc) {
                System.out.println("Please enter either 'true' or 'false'.");
                i.nextLine();
            }
        }
        return room;
    }
}
