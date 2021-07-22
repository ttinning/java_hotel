package rooms;

import rooms.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private BedroomType bedroomType;
    private String roomNumber;
    private int nightlyRate;



    public Bedroom (String roomNumber, BedroomType bedroomType, int nightlyRate) {
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
        this.nightlyRate = nightlyRate;

    }
    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.bedroomType.getValue();
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }

    public BedroomType getBedroomType() {
        return this.bedroomType;
    }
}
