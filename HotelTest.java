
/**
 * Project 2
 * @author Ibrahim Ali
 * Student Number: 
 * Date: 16-December-2015 *
 */

public class HotelTest {

    //Name of hotel, Number of rooms, number of beds, size of beds
    public static void main(String[] args) {
    //create
        Hotel thatHotel = new Hotel("Windsor Manor");

    //configure
        //Bed types
        Bed beds = new Bed("Single");
        Bed bedd = new Bed("Double");
        Bed bedq = new Bed("Queen");
        Bed bedk = new Bed("King");

        //Room 1
        Bed[] bedOne = new Bed[2]; //Produces 2 beds
        bedOne[0] = beds; //Defines bed
        bedOne[1] = bedd; //Defines bed
        Room test = new Room(bedOne); //Creates room and adds beds
        test.bookRoom(); //Books rooms
        thatHotel.addRoom(test); //Adds room to hotel

        //Room 2
        Bed[] bedTwo = new Bed[6];
        bedTwo [0] = beds;
        bedTwo [1] = beds;
        bedTwo [2] = bedd;
        bedTwo [3] = bedd;
        bedTwo [4] = bedq;
        bedTwo [5] = bedk;
        Room test2 = new Room(bedTwo);
        test2.bookRoom();
        thatHotel.addRoom(test2);

    //report
        HotelReport.report(thatHotel);

    }
}
