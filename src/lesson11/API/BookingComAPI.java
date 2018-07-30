package lesson11.API;

import java.util.Arrays;

/*BookingComAPI</b> находит комнаты по заданным параметрам, а так же комнаты,
которые по цене отличаются на 100 единиц в обе стороны. Например если пользователь
ищет комнату с ценой 50 и другими параметрами, BookingComAPI вернет все комнаты с ценой в диапазоне 0 - 150
 */
public class BookingComAPI implements API {
   private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] rooms1=new Room[0];
        int j = 0;
        if(rooms!=null){

        int min = price < 100 ? 0 : price;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null)
                if ((rooms[i].getPrice() >= (min) && rooms[i].getPrice() <= (price + 100)) && rooms[i].getPersons() == persons &&
                        rooms[i].getCityName().equalsIgnoreCase(city) &&
                        rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                    rooms1 = Arrays.copyOf(rooms1, rooms1.length + 1);
                    rooms1[j] = rooms[i];
                    j++;
                }
        }}

        return rooms1;

    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
