import java.util.Scanner;

public class Order {
    static Scanner input = new Scanner(System.in);

    public static void selectPizza() {

        boolean finished = false;
        while (!finished) {
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    addPizza();
                    Main.buyMore = input.nextLine().charAt(0);
                    if (Main.buyMore == 'Y' || Main.buyMore == 'y') {
                        addAnotherPizza();
                    } else {
                        System.out.println("U need to pay: " + Main.payment.vesuvio);
                        //tilføj step2 array til ny txt file
                        Statistik.addToFile();
                        Main.mariosSystem.step2.set(0, "");
                        Main.options();
                    }
                    break;


            }
        }
    }

    public static void addPizza() {

        Main.mariosSystem.step2.add(Main.menu.temps.get(1));
        System.out.println("The following pizza has been added to the order:");
        System.out.println(Main.mariosSystem.step2.toString());
        System.out.println("Do u want more? (Y/N)");
    }

    public static void addAnotherPizza() {
        System.out.println(Main.menu);
        System.out.println("What's next?");
    }
}
                /*case "2":
                    mariosSystem.step2.add(menu.temps.get(2));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.amerikaner);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "3":
                    mariosSystem.step2.add(menu.temps.get(3));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.cacciatore);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "4":
                    mariosSystem.step2.add(menu.temps.get(4));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.carbona);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "5":
                    mariosSystem.step2.add(menu.temps.get(5));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.dennis);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "6":
                    mariosSystem.step2.add(menu.temps.get(6));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.bertil);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "7":
                    mariosSystem.step2.add(menu.temps.get(7));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.silvia);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "8":
                    mariosSystem.step2.add(menu.temps.get(8));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.victoria);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "9":
                    mariosSystem.step2.add(menu.temps.get(9));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.toronfo);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "10":
                    mariosSystem.step2.add(menu.temps.get(10));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.capricciosa);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "11":
                    mariosSystem.step2.add(menu.temps.get(11));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.hawai);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "12":
                    mariosSystem.step2.add(menu.temps.get(12));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.leBlissola);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "13":
                    mariosSystem.step2.add(menu.temps.get(13));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.venezia);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
                case "14":
                    mariosSystem.step2.add(menu.temps.get(14));
                    System.out.println("The following pizza has been added to the order:");
                    System.out.println(mariosSystem.step2.toString());
                    System.out.println("Do u want more?");
                    buyMore = input.nextLine().charAt(0);
                    if (buyMore == 'Y' || buyMore == 'y') {
                        System.out.println(menu);
                        System.out.println("What's next?");
                    } else {
                        System.out.println("U need to pay: " + payment.mafia);
                        mariosSystem.step2.set(0,"");
                    }
                    options();
                    break;
            }
        }
        */

