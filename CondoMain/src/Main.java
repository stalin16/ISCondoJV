import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.io.*;

public class Main {
    private static final int mfloors = 4;
    private static final int mrooms = 3;
    private static final String[][] condo = new String[mfloors][mrooms];
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of floor: "); int floor=input.nextInt();
            System.out.print("Enter the number of room: "); int room=input.nextInt();
                if (floor <=0 || floor>=5 && room<=0 || room>= 4){
                System.out.println("Floor range start from 1-4");
                System.out.println("Room range start from 1-3");
            } else {
                System.out.println("You have successfully set up the condo");
                System.out.print("Number of floor: ");
                floor = input.nextInt();
                if (floor >=5 || floor <= 0) {
                    System.out.println("Floor range start from 1-4");
                }  else {
                    System.out.print("Number of Room: ");
                    room = input.nextInt();
                    int total = floor * room;
                    System.out.println("Total Condo: " + total + " condos");
                    Outer:
                    do {
                        System.out.println("<><><><><>Welcome to USTAD<><><><><>");
                        System.out.println("1. Buy Condo");
                        System.out.println("2. Sell Condo");
                        System.out.println("3. Search Information");
                        System.out.println("4. Display Information");
                        System.out.println("5. Exit");
                        System.out.println("<><><><><><><><><><>");
                        System.out.println("Choose option from (1-5): ");
                        int op = input.nextInt();
                        if (op == 1) {
                            outer:
                            while(true) {
                                System.out.println("Enter your desired floor(1-4) ");
                                floor = input.nextInt();
                                if (floor > 4 || floor <= 0) {
                                    System.out.println("Condo range start from (1-4). Please Input again!");
                                    break outer;
                                }


                            }
                            System.out.print("Enter room number: ");
                            room = input.nextInt();
                            System.out.print("Enter your name: ");
                            String name = input.next();
                            if (condo[floor][room] != null) {
                                System.out.println("This condo is already owned by someone.");
                                return;
                            }
                            condo[floor][room] = name;
                            System.out.println("Condo successfully purchased!");
                        } else if (op == 2) {
                            System.out.print("Enter floor number: ");
                            floor = input.nextInt();
                            System.out.print("Enter room number: ");
                            room = input.nextInt();
                            System.out.println(floor + room);
                        } else if (op == 3) {

                        } else if (op == 4) {
                            System.out.println("<><><><><>Display Condo Information<><><><><>");
                            int i, j;
                            for (i = 0; i < mfloors; i++) {
                                for (j = 0; j < mrooms; j++) {
                                    if (condo[floor][room] != null) {
                                        System.out.println("Floor[" + i + "] => " + condo[floor][room]);
                                    }
                                }
                            }


                        } else if (op == 5) {
                            System.exit(0);
                        } else {
                            System.out.println("Enter the correct number");
                        }
                    }while(true);
                }
            }
        }

    }
}