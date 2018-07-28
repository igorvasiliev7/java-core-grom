package lesson11.API;

public interface API {

    Room[] FindRooms(int price, int persons,String city, String hotel);
    Room[] getAll();
}
