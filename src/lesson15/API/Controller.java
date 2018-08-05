package lesson15.API;

import java.util.Arrays;
import java.util.Date;

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
        Room room = new Room(1, price, persons, new Date(), city, hotel);
        int j = 0;

        Room[] rooms = new Room[0];

        for (API api : apis) {
            if (api != null) {
                Room[] roomsChosen = api.getAll();

                if (roomsChosen.length != 0) for (int i = 0; i < roomsChosen.length; i++) {
                   // System.out.println(roomsChosen[i].equals(room));
                    if (roomsChosen[i].equals(room)) {
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
        Room[] rooms = new Room[0];
        if(api1==null||api2==null) return rooms;
        Room[] api1Rooms = api1.getAll();
        Room[] api2Rooms = api2.getAll();

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

