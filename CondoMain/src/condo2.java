import java.util.*;
class Condo {
    String name;
    boolean a;
    public Condo(){
        a=false;
        name=null;
    }
}
public class condo2 {
    public static void main(String[] args) {
        Condo condo[][] = null;
        String name;
        boolean op1 = false;
        Scanner s = new Scanner(System.in);
        int total,op;
        int floor, room=0;
        int fl,rm;
        int floors,rooms;
        do {
            System.out.println("<><><><><>Set up the condo<><><><><>");
            System.out.print("Enter the number of Floor: ");
            floor = s.nextInt();
            if (floor < 1) {
                System.out.println("Floor mustn't be under one");
                op1=true;
            } else {
                System.out.print("Enter the number of Room: ");
                room = s.nextInt();
                if (room < 1) {
                    System.out.println("Room mustn't be under one");
                    op1=true;
                } else {
                    condo = new Condo[floor][room];
                    for(int i = 0; i < floor;i++){
                        for(int  j = 0;j < room;j++) {
                            condo[i][j] =new Condo();
                        }
                    }
                    total = (floor * room);
                    System.out.println("Total condos: " + total);
                    break;
                }
            }
        } while (op1);
        do {
            System.out.println();
            System.out.println("<><><><><>Welcome To USTAD Condo<><><><><>");
            System.out.println("1. Buy Condo");
            System.out.println("2. Sell Condo");
            System.out.println("3. Search Condo Information");
            System.out.println("4. Display Condo Information");
            System.out.println("5. Exit the program");
            System.out.print("Please Choose option from (1-5): ");  op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("<><><><><>Buy the Condo<><><><><>");
                    boolean a=false;
                    do{
                        System.out.print("Enter your desired floor (1"+(floor > 1 ? "-" + floor :"")+"): ");fl=s.nextInt();
                        if(fl > floor){
                            System.out.println("Floor range start from (1"+(floor > 1 ? "-" + floor :"")+")");
                            a=true;
                        }else{
                            System.out.print("Enter your desired room (1"+(room > 1 ? "-" + room :"")+"): ");rm=s.nextInt();
                            if(rm > room){
                                System.out.println("Room range starts from (1"+(room > 1 ? "-" + room :"")+")");
                                a=true;
                            }else{
                                if(!condo[fl - 1] [rm - 1].a){
                                    System.out.print("Enter your name: ");s.nextLine();name=s.nextLine();
                                    condo[fl - 1] [rm - 1].a=true;
                                    condo[fl - 1] [rm - 1].name=name;
                                    System.out.println("Floor "+fl+", Room "+rm+" has bought by "+name);
                                }else{
                                    System.out.println("Floor "+fl+", Room "+rm+"is bought from someone");
                                }
                                break;
                            }
                        }
                    }while(a);
                    break;
                case 2:
                    System.out.println("<><><><><>Sell the Condo<><><><><>");
                    System.out.print("Enter the floor number to sell (1"+(floor > 1 ? "-" + floor :"")+"): ");  floors=s.nextInt();
                    System.out.print("Enter the room number to sell (1"+(room > 1 ? "-" + room :"")+"): ");     rooms=s.nextInt();
                    if (floors > 0 && floors <= floor && rooms > 0 && rooms <= room){
                        if(condo[floors -1][rooms - 1].a){
                            condo[floors -1][rooms - 1].a=false;
                            condo[floors -1][rooms - 1].name="";
                            System.out.println("Your Condo Floor has been sold.");
                        }else{
                            System.out.println("You don't own condo");
                        }
                    }else {
                        System.out.println("Floor and room don't exist");
                    }
                    break;
                case 3:
                    System.out.println("<><><><><>Search the Condo Information<><><><><>");
                    System.out.println("1. Search by name");
                    System.out.println("2. Search by floor");
                    System.out.println("3. Exit the option");
                    System.out.print("Please choose option from (1-3): "); int search=s.nextInt();
                    if(search>3 || search<1){
                        System.out.println("Enter the correct option");
                    }
                    s.nextLine();
                    switch (search){
                        case 1:
                            System.out.println("<><><><><>Search by owner's name<><><><><>");
                            System.out.print("Enter name to search: "); String sname=s.nextLine();
                            boolean found =false;
                            for (int i = 0; i < floor; i++) {
                                for (int j = 0; j < room; j++) {
                                    if ( condo[i][j].name.equalsIgnoreCase(sname) && condo[i][j].a ) {
                                        System.out.println("Condo owned by " + sname + " is on Floor " + (i + 1) + " Room " + (j + 1));
                                        found = true;
                                    }
                                }
                            }
                            if(!found){
                                System.out.println("Wrong informaton");
                            }
                            break;
                        case 2:
                            System.out.println("<><><><><>Search by floor<><><><><>");
                            System.out.print("Enter the floor to search: ");int sfloor=s.nextInt();
                            if (sfloor >= 1 && sfloor <= floor) {
                                System.out.print("Floor [" + sfloor + "]:\t");
                                for (int j = 0; j < room; j++) {
                                    if (condo[sfloor - 1][j].a) {
                                        System.out.print(condo[sfloor - 1][j].name+"  ");
                                    } else {
                                        System.out.print("NULL  ");
                                    }
                                }
                                s.nextLine();
                            } else {
                                System.out.println("Incorrect floor number");
                            }
                    }
                    break;
                case 4:
                    System.out.println("<><><><><>Display Condo Information<><><><><>");
                    for (int i = floor - 1; i >= 0; i--) {
                        System.out.print("Floor [" + (i + 1) + "]: ");
                        for (int j = 0; j < room; j++) {
                            if (condo[i][j].a) {
                                System.out.print(condo[i][j].name + "  ");
                            } else {
                                System.out.print("NULL  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Exit the program");
                    System.exit(0);
                    break;
            }
        } while (op != 0);
    }
}

