import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static int totalPrice = 0;
    static char buyMore;
    static Payment payment;
    static Order order;
    static Menu menu;
    static MariosSystem mariosSystem;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        payment = new Payment();
        order = new Order();
        menu = new Menu();
        mariosSystem = new MariosSystem();
        options();
    }

    public static void options(){
        System.out.println(mariosSystem.step1.get(0));
        System.out.println(mariosSystem.step1.get(1));
        System.out.println(mariosSystem.step1.get(3));
        System.out.println(mariosSystem.step1.get(4));
        boolean finished = false;
        while (!finished){
            String choice = input.nextLine();
            switch (choice){
                case"1":
                    System.out.println(menu);
                    options();
                    break;
                case"2":
                    System.out.println(menu);
                    System.out.println(mariosSystem.step1.get(2));
                    Order.selectPizza();
                    break;
                case "3":
                    Statistik.readSortedOrderList();
                    break;
                case "4":
                    Statistik.readOrderList();
                    Order.removeOrder();
            }
        }
    }
}