import flowers.Peony;
import flowers.Shop;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    Shop shop = new Shop();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        main.shopMenu();

        System.out.println("Welcome to Peony shop!");
    }

    public void shopMenu() {
        String userInput = "";
        do {
            System.out.println("Welcome to Peony shop! Please choose:");
            System.out.println("1. Find your peony");
            System.out.println("2. View all peonys on the shop");
            System.out.println("3. Show chosen peony");
            System.out.println("4. Remove peony");
            System.out.println("\nEnter DONE to quit the shop.");

            System.out.println("Find:  ");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "DONE":
                    System.out.println("Quit the shop. Thank you for visiting!");
                    break;
                case "1":
                    addPeony();
                case "2":
                    viewAllPeonys();
                    break;
                default:
                    break;
            }
        } while (!userInput.equalsIgnoreCase("DONE"));

        return;
    }

    public void addPeony() {
        System.out.println("\n Add peony");

        Peony peony = new Peony();
        System.out.println("Enter name: ");
        peony.name = scanner.nextLine();

        System.out.println("Enter type: ");
        peony.type = scanner.nextLine();

        System.out.println("Enter color: ");
        peony.color = scanner.nextLine();

        System.out.println("Enter name: ");
        peony.name = scanner.nextLine();

        peony.id = UUID.randomUUID();

        shop.addPeony(peony);

        String message = shop.addPeony(peony);

        System.out.println(message);

        System.out.println("\n Press ENTER to continue \n");
        scanner.nextLine();
    }

    public void viewAllPeonys() {
        ArrayList<Peony> allPeonys = shop.getAllPeonys();
        System.out.println("\n All available peonys: \n");
        System.out.println("Peony Name\t Type\t Color");
        for (Peony peony : allPeonys) {
            System.out.println(peony.name + " \t" + peony.type + "\t" + peony.color);
        }
    }
}