package rooms;
import rooms.Room;

public class ConferenceRoom extends Room {

    private String name;
    private int capacity;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
