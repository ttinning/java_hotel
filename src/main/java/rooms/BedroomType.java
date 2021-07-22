package rooms;

public enum BedroomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4);

    private final int value;

    BedroomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
