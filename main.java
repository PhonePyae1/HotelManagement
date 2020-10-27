package Cs1202;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        BuildingA buildingA = new BuildingA(20);
        BuildingB buildingB = new BuildingB(16);

        ArrayList<Hotel> hotelArrayList = new ArrayList<>();
        hotelArrayList.add(buildingA);
        hotelArrayList.add(buildingB);
        int total = 0;
        boolean check = true;
        while (check) {
            Menu();
            System.out.println("Choose: ");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Type name: ");
                    String name = scanner.next();
                    System.out.println("Type grade of room: ");
                    String grade = scanner.next();
                    bookRoom(grade,buildingA,buildingB);

                    break;
                case 2:
                    System.out.println("Room number: ");
                    int roomNum = scanner.nextInt();
                    if (roomNum < 200) {
                        buildingA.makePayment(roomNum);
                    }else{
                        buildingB.makePayment(roomNum);
                    }
                    System.out.println("Checked out.");
                    break;


                case 3:
                    for (int i = 0; i < hotelArrayList.size(); i++) {
                        int room = hotelArrayList.get(i).getAmountOfRoom();
                        System.out.println("Building " + (i+1) + " : " + room);
                        total += room;
                    }
                    System.out.println("Total amount of room: " + total);
                    break;

                case 4:
                    System.out.println("End of Program");
                    check = false;
                    break;
                default:
                    System.out.println("Enter a correct input.");
                    break;
            }
        }
    }

    public static void Menu() {
        System.out.println("\nChoose an option: ");
        System.out.println("1. Book a room: ");
        System.out.println("2. Make a payment: ");
        System.out.println("3. View sales report");
        System.out.println("4. Exit the program");
    }

    static void bookRoom(String grade,BuildingA a1,BuildingB b1) {
        switch (grade) {
            case "standard":
                if (a1.bookStandard()) {
                    System.out.println("Booking succeeded in Building A");
                }else if (b1.bookStandard()) {
                    System.out.println("Booking succeeded in Building B");
                }else{
                    System.out.println("Standard is not available");
                }
                break;
            case "deluxe":
                if (a1.bookDeluxe()) {
                    System.out.println("Booking succeeded in Building A");
                }else if (b1.bookDeluxe()) {
                    System.out.println("Booking succeeded in Building B");
                }else{
                    System.out.println("Standard is not available");
                }
                break;
            case "suite":
                if (a1.bookSuite()) {
                    System.out.println("Booking succeeded in Building A");
                }else if (b1.bookSuite()) {
                    System.out.println("Booking succeeded in Building B");
                }else{
                    System.out.println("Suite is not available");
                }
                break;
            default:
                System.out.println("Input a correct Grade of Room.");

        }
    }
}
