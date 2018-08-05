package lesson15.API;


import java.util.Arrays;
import java.util.Date;

public class Demo {
    @Override
    public String toString() {

        return super.toString();
    }

    public static void main(String[] args) {

        Room room1 = new Room(1, 23, 2, new Date(), "Kiev", "C1");
        Room room2 = new Room(2, 23, 1, new Date(), "London", "C1");
        Room room3 = new Room(3, 23, 2, new Date(), "London", "C1");
        Room room4 = new Room(4, 23, 2, new Date(), "Paris", "C1");
        Room room5 = new Room(5, 23, 32, new Date(), "London", "C1");
        Room room6 = new Room(6, 18, 2, new Date(), "Paris", "C1");
        Room room7 = new Room(7, 23, 32, new Date(), "Kiev", "C1");

        Room[] rooms1 = {room1, room2, room3, room4, room7};
        Room[] rooms2 = {room6, room1, room5, room3, room4, room2};
        Room[] rooms3 = {room5, room7, room3, room6};

        API google = new GoogleAPI(rooms1);
        API trip = new TripAdvisorAPI(rooms2);
        API booking = new BookingComAPI(rooms3);

        API[] apis = {google, trip, booking};
        Controller controller = new Controller(apis);

//Test Google findRooms
        //result+
        //transfer null+
        Room[] test1 =google.findRooms(23,2,null,null);
        System.out.println("Test1");
       System.out.println(Arrays.toString(test1));

        //Test2 TripAdvisorApi
    //  result+
    //    transfer null+
        Room[] test2 =trip.findRooms(18,2,"Paris","C1");
        System.out.println("Test2");
      System.out.println(Arrays.toString(test2));

        //Test3 BookingComApi
    // //result+
       // transfer null+
        Room[] test3 =booking.findRooms(10,2,"null","null");
        System.out.println("Test3");
        if(test3!=null)  System.out.println(Arrays.toString(test3));

        //result+
        //transfer one or both nulls

       Room[] test4= controller.check(google,trip);
        System.out.println("Test4");
        System.out.println(Arrays.toString(test4));

        //result+
        //transfer one or both nulls+
        System.out.println("Test5");
        Room[] test5=controller.requestRooms(23, 2, "Kiev", "C1");
        System.out.println(Arrays.toString(test5));


}}
