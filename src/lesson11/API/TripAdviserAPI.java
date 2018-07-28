package lesson11.API;

/*TripAdvisorAPI</b> находит комнаты по заданным параметрам, а так же,
количество гостей ищется в диапазоне +-1. Например если пользователь ищет
комнату с ко-вом гостей 3 и другими параметрами, TripAdvisorAPI вернет все комнаты с ко-вом гостей от 2 до четырех
 */
public class TripAdviserAPI implements API {
    Room[] rooms;

    public TripAdviserAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] FindRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
