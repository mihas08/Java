import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 /** Клас Hotel съдържа информация за стаята. Потребителя може да избира от опциите предоставени в менюто.
  * От конзолата може да се добавя нов клиент, да се види обшия вид на стаите (дали тя е заета или не),
  * може да се изтрие клиент, може да се запази цялостната инфомация за стаите във файл.
  */
public class Hotel {
 
    static String roomName;
    static int room = 0;
    static String option;
    static String line;
    static String name;
 
    public static void main(String[] args) throws IOException {
 
        String TheOperatorString;
        char TheOperatorChar;
 
        room[] hotel = new room[10];
        hotel[0] = new room();
        hotel[1] = new room();
        hotel[2] = new room();
        hotel[3] = new room();
        hotel[4] = new room();
        hotel[5] = new room();
        hotel[6] = new room();
        hotel[7] = new room();
        hotel[8] = new room();
        hotel[9] = new room();
 
        do {
 
            System.out.println("Enter a to Add a customer to room ");
            System.out.println("Enter v to View all Rooms ");
            System.out.println("Enter d to Delete customer from room ");
            System.out.println("Enter l data back from a file into the array.");
            System.out.println("Enter s to save program array into plain text");
 
            Scanner input = new Scanner(System.in);
            TheOperatorString = input.next();
            TheOperatorChar = TheOperatorString.charAt(0);
            switch (TheOperatorChar) {
                case 'a':
                    Add(hotel);
                    break;
                case 'v':
                    View(hotel);
                    break;
                case 'd':
                    Delete(hotel);
                    break;
                case 'l':
                    Load(hotel);
                    break;
                case 's':
                    Save(hotel);
                    break;
            }
        } while (TheOperatorChar != 'e');
        while (room <= 10) {
            Add(hotel);
            View(hotel);
            Delete(hotel);
            Load(hotel);
            Save(hotel);
        }
    }
 
    private static void Add(room[] hotel) {
        System.out.println("Enter room number  ");
        Scanner input = new Scanner(System.in);
        room = input.nextInt();
        System.out.println("Enter name for room " + room + " :");
        roomName = input.next();
        hotel[room].setName(roomName);
    }
 
    private static void View(room[] hotel) {
        for (int x = 0; x < 10; x++) {
            System.out.println("room " + x + " occupied by " + hotel[x].getName());
        }
    }
 
    private static void Delete(room[] hotel) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a Name");
        option = input.next();
        for (int z = 0; z < 10; z++) {
            if (option.equals(hotel[z].getName())) {
                hotel[room] = new room();
            }
        }
    }
 
    private static void Load(room[] hotel) throws IOException {
        int e = 0;
        BufferedReader to;
        try {
            to = new BufferedReader(new FileReader("load.txt"));
            line = to.readLine();
            while (line != null) {
                System.out.println(line);
                e++;
                line = to.readLine();
            }
        } catch (Exception exc) {
        }
    }
 
    private static void Save(room[] hotel) {
        int e;
        try {
            FileWriter exFile = new FileWriter("load.txt");
            for (e = 0; e < 10; e++) {
                name = hotel[e].getName();
                if (hotel[e].mainName.equals("A")) {
                    exFile.write(" Room" + " " + e + " " + " ");
                } else {
                    exFile.write(" Room" + " " + e + " " + " is occupied by "
                            + " " + " '" + hotel[e].mainName + "' " + " " + "");
                }
                exFile.write("\n");
            }
            exFile.close();
        } catch (Exception exc) {
        }
    }
}