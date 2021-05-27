
/**
 * Project 2
 * @author Ibrahim Ali
 * Student Number: 
 * Date: 16-December-2015 *
 */

//Import
import java.util.*;

public class Room {

    //Beds per room
    private List<Bed> bed = new ArrayList<Bed>();
    private boolean booked; //True = booked; False = not booked

    public Room(Bed[] beds) {
        bed.addAll(Arrays.asList(beds));
        booked = false;
    }

    public int numberOfBeds() {
        return bed.size();
    }

    public String sizeOfBeds(int bedNo) {
        return bed.get(bedNo).getSize();
    }

    public boolean isBooked() { //Finds out if room is booked
        return booked;
    }

    public boolean bookRoom() { //Books room

        if (booked == true) {
            return false;
        } else {
            booked = true;
            return true;
        }
    }

    public boolean emptyRoom() { //Empty's booked rooms
        if (booked == true) {
            booked = false;
            return true;
        } else {
            return false;
        }
    }
}
