package Cs1202;

import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
    private ArrayList<Room> room = new ArrayList<Room>();
    private int roomNumber;
    private int amountOfRoom;

    public Hotel() {
        this.roomNumber = 0;
    }

    public Hotel(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getRoomNumber() {
        return this.roomNumber;
    }
    Room getRoom(int Number) {
        return  room.get(Number);
    }
    public void addRoom(Room r) {
        room.add(r);
    }
    void roomAmount() {
        this.amountOfRoom++;
    }
    public int getAmountOfRoom() {
        return this.amountOfRoom;
    }
}
