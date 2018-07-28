package lesson11.API;

/*BookingComAPI</b> находит комнаты по заданным параметрам, а так же комнаты,
которые по цене отличаются на 100 единиц в обе стороны. Например если пользователь
ищет комнату с ценой 50 и другими параметрами, BookingComAPI вернет все комнаты с ценой в диапазоне 0 - 150
 */
public class BookingComAPI implements API{
    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] FindRooms(int price, int persons, String city, String hotel) {

        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
