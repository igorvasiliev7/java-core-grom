package lesson15.API;

import java.util.Arrays;

/*Controller</b> - класс, который содержит поле API[] apis,инициализируется в
конструкторе, и два общедоступных метода

Room[] requestRooms(int price, int persons, String city, String hotel)</b>
Который используя все реализации интерфейса API, находит комнаты по заданным параметрам

<b style="font-weight:bold;">Room[] check(API api1, API api2)</b>
Который находит общие комнаты у двух API (в результирующий массив добавлять комнаты с api1).
Комнаты будем считать равными, если у них одинаковые все поля кроме id и dateAvailableFrom.
Гарантируется что id комнаты уникальный во всей системе

 */
public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int j = 0;

        Room[] rooms = new Room[0];

        for (API api : apis) {
            if (api != null) {
                Room[] roomsChosen = api.findRooms(price, persons, city, hotel);
                if (roomsChosen.length != 0) for (int i = 0; i < roomsChosen.length; i++) {
                    if (roomsChosen[i] != null) {
                        rooms = Arrays.copyOf(rooms, rooms.length + 1);
                        rooms[j] = roomsChosen[i];
                        j++;
                    }
                }
            }
        }
        return rooms;

    }

    public Room[] check(API api1, API api2) {
        Room[] api1Rooms = api1.getAll();
        Room[] api2Rooms = api2.getAll();
      Room[] rooms = new Room[0];
        int g = 0;

        for (int i = 0; i < api1.getAll().length; i++) {
            for (int j = 0; j < api2.getAll().length; j++) {
                //TODO
                if (api1Rooms[i].equals(api2Rooms[j])) {
                    rooms = Arrays.copyOf(rooms, rooms.length + 1);
                    rooms[g] = api1Rooms[i];
                    g++;
                    break;
                }
            }
        }

        return rooms;

    }
}

