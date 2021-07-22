package rooms;

import rooms.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private BedroomType bedroomType;
    private String roomNumber;

    public Bedroom (String roomNumber, BedroomType bedroomType) {
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;

    }
    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.bedroomType.getValue();
    }
}
