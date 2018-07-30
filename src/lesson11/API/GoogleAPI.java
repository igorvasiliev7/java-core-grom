package lesson11.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

//GoogleAPI</b> ищет сторого по заданным параметрам
public class GoogleAPI implements API {
   private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room[] rooms1=new Room[0];
        int j = 0;

       if(rooms!=null){

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons &&
                        rooms[i].getCityName().equalsIgnoreCase(city) &&
                        rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                    rooms1 = Arrays.copyOf(rooms1, rooms1.length + 1);
                    rooms1[j] = rooms[i];
                    j++;
                }
            }
        }}
        
         return rooms1;

    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
