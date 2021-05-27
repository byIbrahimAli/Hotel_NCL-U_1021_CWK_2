
/**
 * Project 2
 * @author Ibrahim Ali
 * Student Number: 
 * Date: 16-December-2015 *
 */

//Import
import java.util.*;

public class Hotel {

    //Hotel Name and Rooms
    private String name;
    private List<Room> room = new ArrayList<Room>();

    public Hotel(String name) {
        this.name = name;
    }

    public int numberOfRooms() {
        return room.size();
    }

    public String nameOfHotel() {
        return name;
    }

    public String sizeOfBeds(int bedNo, int roomNo) {
        return room.get(roomNo).sizeOfBeds(bedNo);
    }

    public int noOfBeds(int roomNo) {
        return room.get(roomNo).numberOfBeds();
    }

    public void addRoom(Room rooms) {
        room.add(rooms);
    }

    public boolean hasVacancies() {
        for (Room i : room) {
            if (i.isBooked() == false) {
                return true;
            }
        }
        return false;
    }

    public boolean bookRoom(int roomNo) {
        return room.get(roomNo).bookRoom();
    }

    public boolean emptyRoom(int roomNo) {
        return room.get(roomNo).emptyRoom();
    }
}
