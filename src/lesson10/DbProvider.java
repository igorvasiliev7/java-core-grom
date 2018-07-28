package lesson10;

abstract public class DbProvider {
    abstract void connectToDb();
    abstract void disconnectFromDb();
}
