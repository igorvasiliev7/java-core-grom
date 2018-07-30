package lesson11.API;

/*TripAdvisorAPI</b> находит комнаты по заданным параметрам, а так же,
количество гостей ищется в диапазоне +-1. Например если пользователь ищет
комнату с ко-вом гостей 3 и другими параметрами, TripAdvisorAPI вернет все комнаты с ко-вом гостей от 2 до четырех
 */
public class TripAdvisorAPI implements API {
   private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] rooms1 = new Room[rooms.length];
        int j = 0;

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                if (rooms[i].getPrice() == price && (rooms[i].getPersons() >= (persons - 1) && rooms[i].getPersons() <= (persons + 1)) &&
                        rooms[i].getCityName().equalsIgnoreCase(city) &&
                        rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                    rooms1[j] = rooms[i];
                    j++;
                }
            }
        }

        if (j != 0) return rooms1;
        else return null;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
