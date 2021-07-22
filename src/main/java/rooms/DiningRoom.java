package rooms;

public class DiningRoom extends Room {

    private String name;
    private int capacity;

    public DiningRoom(String name, int capacity) {
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



