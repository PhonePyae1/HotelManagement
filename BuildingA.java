package Cs1202;

public class BuildingA extends Hotel{
    private int count1;
    private int count2;
    private int count3;
    public BuildingA(int room) {
        super(room);

        for (int i = 0; i < 10; i++) {
            Room r = new Room(100,100+i);
            addRoom(r);
        }

        for (int i = 0; i < 5; i++) {
            Room r = new Room(250,110+i);
            addRoom(r);
        }

        for (int i = 0; i < 5; i++) {
            Room r = new Room(600,115+i);
            addRoom(r);
        }
    }
    public boolean bookStandard() {
        if (count1 != 10) {
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
        if (count2 != 5) {

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
        for(int i = 0; i < 20;i++) {
            Room r = this.getRoom(i);
            if (r.getRoomNum() == roomNum) {
                r.setAvailability(true);
                if (r.getRoomNum()>100 && r.getRoomNum() < 110) {
                    count1--;
                }
                else if (r.getRoomNum() < 115 & r.getRoomNum() >110) {
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
        if (count3 != 5) {

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
