import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    static Scanner input = new Scanner(System.in);
    static char t;
    static int time;
    static int i = 1;
    static int j = 0;
    static ArrayList<String> orders = new ArrayList<>();
    static int orderID = 00000;

    public static void addOrder() {

        orders.add(Main.mariosSystem.step2.get(j));
        j = j + 1;
    }

    public static void selectPizza() {

        boolean finished = false;
        while (!finished) {
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    i = 1;
                    switchOptions();
                    break;
                case "2":
                     i = 2;
                    switchOptions();
                    break;
                case "3":
                    i = 3;
                    switchOptions();
                    break;
                case "4":
                    i = 4;
                    switchOptions();
                    break;
                case "5":
                    i = 5;
                    switchOptions();
                    break;
                case "6":
                    i = 6;
                    switchOptions();
                    break;
                case "7":
                    i = 7;
                    switchOptions();
                    break;
                case "8":
                    i = 8;
                    switchOptions();
                    break;
                case "9":
                    i = 9;
                    switchOptions();
                    break;
                case "10":
                    i = 10;
                    switchOptions();
                    break;
                case "11":
                    i = 11;
                    switchOptions();
                    break;
                case "12":
                    i = 12;
                    switchOptions();
                    break;
                case "13":
                    i = 13;
                    switchOptions();
                    break;
                case "14":
                    i = 14;
                    switchOptions();
                    break;
            }
        }
    }

    public static void removeOrder() {
        File removeOrder = new File("orderList.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(removeOrder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.contains("0000" + Integer.toString(orderID))) {
                System.out.println("here i am");
            }
        }


    }

    public static void addPizza() {

        Main.mariosSystem.step2.add(Main.menu.temps.get(i));
        System.out.println("The following pizza has been added to the order:");
        System.out.println(Main.mariosSystem.step2.toString());
        System.out.println("Do u want more? (Y/N)");
    }

    public static void addAnotherPizza() {
        System.out.println(Main.menu);
        System.out.println("What's next?");
    }

    public static void pickUp () {

        System.out.println("When should the order be rdy?" + "\n Type: (F/M/S)");
        System.out.println("Fast = 15 min");
        System.out.println("Medium = 30 min");
        System.out.println("Slow = 60 min");
        t = input.nextLine().charAt(0);
        if (t == 'F' || t == 'f') {
            time = 15;
            System.out.println("You choose: " + time + "min");
        } else if (t == 'M' || t == 'm') {
            time = 30;
            System.out.println("You choose: " + time + "min");
        } else if (t == 'S' || t == 's') {
            time = 60;
            System.out.println("You choose: " + time + "min");
        }
        setJ(0);
    }

    public static void setJ(int j) {
        Order.j = j;
    }

    public static void switchOptions() {
        addPizza();
        addOrder();
        Main.buyMore = input.nextLine().charAt(0);
        if (Main.buyMore == 'Y' || Main.buyMore == 'y') {
            addAnotherPizza();
        } else {
            pickUp();
            orderID++;
            Statistik.addToOrder();
            System.out.println("You need to pay:");
            Payment.getTotalPrice();
            Statistik.addToFile();
            Main.options();
        }
    }
}

/*public static void completeOrder() {
        System.out.println(Order.orders);
        System.out.println("Which order is complete?");
        //chose which order to remove
        boolean finished = false;
        while (!finished) {
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    i = 0;
                    orders.remove(i);
                    System.out.println(orders);
                    break;
                case "2":
                    Main.options();
                    break;
            }
        }
    }*/