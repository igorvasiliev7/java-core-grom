package lesson15.API;


import java.util.Arrays;
import java.util.Date;

public class Demo {
    @Override
    public String toString() {

        return super.toString();
    }

    public static void main(String[] args) {

        Room room1 = new Room(1, 23, 2, new Date(), "C1", "Kiev");
        Room room2 = new Room(2, 23, 1, new Date(), "C1", "kiev");
        Room room3 = new Room(3, 23, 2, new Date(), "C1", "Kiev");
        Room room4 = new Room(4, 23, 2, new Date(), "C1", "Kiev");
        Room room5 = new Room(5, 23, 32, new Date(), "C1", "kiev");
        Room room6 = new Room(6, 18, 2, new Date(), "C1", "Kiev");
        Room room7 = new Room(7, 23, 32, new Date(), "C1", "kiev");

        Room[] rooms1 = {room1, room2, room3, room4, room7};
        Room[] rooms2 = {room6, room1, room5, room3, room4, room2};
        Room[] rooms3 = {room5, room7, room3, room6};

        API google = new GoogleAPI(rooms1);
        API trip = new TripAdvisorAPI(rooms2);
        API booking = new BookingComAPI(rooms3);

        API[] apis = {google, trip, booking};
        Controller controller = new Controller(apis);


//        Room[] test1 =google.findRooms(23,2,"kiev","C1");
//        System.out.println("Test1");
//        if(test1!=null)  for(Room room:test1){ System.out.println(room); } else System.out.println("No such rooms");
////
//        Room[] test2 =trip.findRooms(23,2,"kiev","C1");
//        System.out.println("Test2");
//        if(test2!=null)  for(Room room:test2){ System.out.println(room); } else System.out.println("No such rooms");
//
//        Room[] test3 =booking.findRooms(10,2,"kiev","C1");
//        System.out.println("Test3");
//        if(test3!=null)  for(Room room:test3){ System.out.println(room); } else System.out.println("No such rooms");
//
//       Room[] test4= controller.check(google,trip);
//        System.out.println("Test4");
//        if(test4!=null)  for(Room room:test4){ System.out.println(room); } else System.out.println("No such rooms");

         ;
        System.out.println("Test5");
        System.out.println(Arrays.toString(controller.requestRooms(23, 2, "C1", "Kiev")));
        //System.out.println("No such rooms");

}}
