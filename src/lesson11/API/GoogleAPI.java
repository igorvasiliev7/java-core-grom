package lesson11.API;

import java.util.ArrayList;

//GoogleAPI</b> ищет сторого по заданным параметрам
public class GoogleAPI implements API {
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> rooms1=new ArrayList<>();

        for(Room room:rooms){
            if(room!=null)
                if(room.getPrice()==price&&room.getPersons()==persons&&
                    room.getCityName().equalsIgnoreCase(city)&&
            room.getHotelName().equalsIgnoreCase(hotel))
                    rooms1.add(room);
        }

        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
