package lesson11.API;

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
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){
        int maxLengthRooms=0;
        int j=0;
        for(API api:apis) if(api!=null) maxLengthRooms+=api.getAll().length;
        Room[] rooms=new Room[maxLengthRooms];
        Room[] roomsChosen;
        for(API api:apis) {
            roomsChosen = api.findRooms(price, persons, city, hotel);
            if(roomsChosen!=null)for(int i=0;i<roomsChosen.length;i++){
                if(roomsChosen[i]!=null)rooms[j]=roomsChosen[i];
            }
        }
        return rooms;
    }

    Room[] check(API api1, API api2) {
        Room[] api1Rooms=api1.getAll();
        Room[] api2Rooms=api2.getAll();

        Room[]rooms=new Room[api1Rooms.length];
        int g=0;

        for(int i=0;i<api1.getAll().length;i++){
            for(int j=0;j<api2.getAll().length;j++){
                if(api1Rooms[i].getHotelName().equalsIgnoreCase(api2Rooms[j].getHotelName())&&
                        api1Rooms[i].getCityName().equalsIgnoreCase(api2Rooms[j].getCityName())&&
                        api1Rooms[i].getPersons()==api2Rooms[j].getPersons()&&
                        api1Rooms[i].getPrice()==api2Rooms[j].getPrice())
                { rooms[g]=api1Rooms[i]; g++; break;}
            }
        }

        if(rooms[0]!=null)return rooms;
        else return null;
        }
    }

