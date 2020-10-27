package Cs1202;

public class BuildingB extends Hotel {
    private int count1;
    private int count2;
    private int count3;
    public BuildingB(int room) {
        super(room);

        for (int i = 0; i < 8; i++) {
            Room r = new Room(100,200+i);
            addRoom(r);
        }

        for (int i = 0; i < 4; i++) {
            Room r = new Room(250,208+i);
            addRoom(r);
        }

        for (int i = 0; i < 4; i++) {
            Room r = new Room(600,212+i);
            addRoom(r);
        }
    }

    public boolean bookStandard() {
        if (count1 != 8) {
            Room r = this.getRoom(count1);
            if (r.isBooked()) {
                return false;
            } else {
                r.setAvailability(false);
                roomAmount();
                System.out.println("Booked: " + r.getRoomNum());
                count1++;
                return true;
            }
        }else{
            return false;
        }

    }
    public boolean bookDeluxe() {
        if (count2 != 8) {

            Room r = this.getRoom(count2);
            if (r.isBooked()) {
                return false;
            } else {
                r.setAvailability(false);
                roomAmount();
                count2++;
                System.out.println("Booked: " + r.getRoomNum());
                return true;
            }
        }
        return false;
    }
    public boolean makePayment(int roomNum) {
        for(int i = 0; i < 16;i++) {
            Room r = this.getRoom(i);
            if (r.getRoomNum() == roomNum) {
                r.setAvailability(true);
                if (r.getRoomNum()>200 && r.getRoomNum()<208) {
                    count1--;
                }
                else if (r.getRoomNum() < 212 & r.getRoomNum() >208) {
                    count2--;
                }else{
                    count3--;
                }
                return true;
            }
        }
        return false;
    }
    public boolean bookSuite() {
        if (count3 != 4) {

            Room r = this.getRoom(count3);
            if (r.isBooked()) {
                return false;
            } else {
                r.setAvailability(false);
                roomAmount();
                count3++;
                System.out.println("Booked: " + r.getRoomNum());
                return true;
            }
        }
        return false;
    }
}
