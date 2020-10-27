package Cs1202;

public class Room {
    private int price;
    private boolean availability;
    private int roomNum;

    public Room(int price,int roomNum) {
        this.price = price;
        this.availability = true;
        this.roomNum = roomNum;
    }
    public boolean isBooked() {
        return !availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public int getRoomNum() {
        return this.roomNum;
    }
    public int getPrice() {
        return this.price;
    }
}
